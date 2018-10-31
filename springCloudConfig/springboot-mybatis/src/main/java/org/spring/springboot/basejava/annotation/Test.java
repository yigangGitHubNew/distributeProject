package org.spring.springboot.basejava.annotation;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
	    ClassUtil classUtil = new ClassUtil();
		/*boolean flag = BaseInterface.class.isAnnotationPresent(MethodInfo.class);
		if(flag) {
			MethodInfo methodInfo = BaseInterface.class.getAnnotation(MethodInfo.class);
			System.out.println(methodInfo.category().toString());
		}*/
		String packeName = BaseInterface.class.getPackage().getName();
		List<Class> classNames = classUtil.getClassNames(packeName,false);
		int i = 0;
		for(Class cla : classNames) {
			if(cla.isAnnotationPresent(MethodInfo.class)) {
				MethodInfo method = (MethodInfo) cla.getAnnotation(MethodInfo.class);
				System.out.println("The class is use annotation "+i+",the class name is "+cla.getSimpleName()+",the annotation return name is "+method.category());
				i++;
			}
		}
	}
}
