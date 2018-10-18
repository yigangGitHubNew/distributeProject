package org.spring.springboot.annotation;

import java.io.File;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 *  class的工具类
 * @author yigang.wu
 * @date created in $time $date
 */
public class ClassUtil {

    /**
     * 根据包名生成clas对象
     * @param packageName 包的名称
     * @param flag 是否对子目录进行操作
     * @return
     */
    public List<Class> getClassNames(String packageName,boolean flag){
        Set<String> classNames = null;
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String packagePath = packageName.replace(".", "/");

        URL url = classLoader.getResource(packagePath);
        if(url != null) {

            String protocol = url.getProtocol();
            if("file".equals(protocol)) {
                classNames = getClassNameFromDir(url.getPath(), packageName, flag);
            }else if (protocol.equals("jar")) {
                JarFile jarFile = null;
                try{
                    jarFile = ((JarURLConnection) url.openConnection()).getJarFile();
                } catch(Exception e){
                    e.printStackTrace();
                }

                if(jarFile != null){
                    getClassNameFromJar(jarFile.entries(), packageName, flag);
                }
            }
        }else {
            /*从所有的jar包中查找包名*/
            classNames = getClassNameFromJars(((URLClassLoader)classLoader).getURLs(), packageName, flag);
        }
        List<Class> classes = null;
        if(!classNames.isEmpty() && classNames != null) {
            classes = new ArrayList<Class>();
            for(String className : classNames) {
                try {
                    classes.add(classLoader.loadClass(className));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }

        }
        return classes;
    }

    /**
     * 从项目文件获取某包下所有类
     * @param filePath 文件路径
     * @param className 类名集合
     * @param isRecursion 是否遍历子包
     * @return 类的完整名称
     */
    private Set<String> getClassNameFromDir(String filePath, String packageName, boolean isRecursion) {
        Set<String> className = new HashSet<String>();
        File file = new File(filePath);
        File[] files = file.listFiles();
        for (File childFile : files) {
            if (childFile.isDirectory()) {
                if (isRecursion) {
                    className.addAll(getClassNameFromDir(childFile.getPath(), packageName+"."+childFile.getName(), isRecursion));
                }
            } else {
                String fileName = childFile.getName();
                if (fileName.endsWith(".class") && !fileName.contains("$")) {
                    className.add(packageName+ "." + fileName.replace(".class", ""));
                }
            }
        }

        return className;
    }

    /**
     * @param jarEntries
     * @param packageName
     * @param isRecursion
     * @return
     */
    private Set<String> getClassNameFromJar(Enumeration<JarEntry> jarEntries, String packageName, boolean isRecursion){
        Set<String> classNames = new HashSet<String>();

        while (jarEntries.hasMoreElements()) {
            JarEntry jarEntry = jarEntries.nextElement();
            if(!jarEntry.isDirectory()){
                /*
                 * 这里是为了方便，先把"/" 转成 "." 再判断 ".class" 的做法可能会有bug
                 * (FIXME: 先把"/" 转成 "." 再判断 ".class" 的做法可能会有bug)
                 */
                String entryName = jarEntry.getName().replace("/", ".");
                if (entryName.endsWith(".class") && !entryName.contains("$") && entryName.startsWith(packageName)) {
                    entryName = entryName.replace(".class", "");
                    if(isRecursion){
                        classNames.add(entryName);
                    } else if(!entryName.replace(packageName+".", "").contains(".")){
                        classNames.add(entryName);
                    }
                }
            }
        }

        return classNames;
    }

    /**
     * 从所有jar中搜索该包，并获取该包下所有类
     * @param urls URL集合
     * @param packageName 包路径
     * @param isRecursion 是否遍历子包
     * @return 类的完整名称
     */
    private Set<String> getClassNameFromJars(URL[] urls, String packageName, boolean isRecursion) {
        Set<String> classNames = new HashSet<String>();

        for (int i = 0; i < urls.length; i++) {
            String classPath = urls[i].getPath();

            //不必搜索classes文件夹
            if (classPath.endsWith("classes/")) {continue;}

            JarFile jarFile = null;
            try {
                jarFile = new JarFile(classPath.substring(classPath.indexOf("/")));
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (jarFile != null) {
                classNames.addAll(getClassNameFromJar(jarFile.entries(), packageName, isRecursion));
            }
        }

        return classNames;
    }
}
