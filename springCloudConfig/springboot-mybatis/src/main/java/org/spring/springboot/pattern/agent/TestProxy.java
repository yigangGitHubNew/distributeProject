package org.spring.springboot.pattern.agent;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class TestProxy {

    public static void main(String[] args) throws IOException {
        RealObject realObject = (RealObject) new RealObjectImpl();
        ProxyHandler proxyHandler = new ProxyHandler(realObject);
        byte[] classFil = ProxyGenerator.generateProxyClass("$Proxy0", RealObject.class.getInterfaces());
        String path = "D:/RealObject.class";
        FileOutputStream fos = new FileOutputStream(new File(path));
        fos.write(classFil);
        fos.close();
        RealObject realObject1 = (RealObject)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{RealObject.class},proxyHandler);
        realObject1.say();
    }
}
