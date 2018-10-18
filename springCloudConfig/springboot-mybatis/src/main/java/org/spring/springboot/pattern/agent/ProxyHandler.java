package org.spring.springboot.pattern.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class ProxyHandler implements InvocationHandler {

    private RealObject realObject;

    public ProxyHandler(RealObject realObject){
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        System.out.println("代理对象开始代理之前");
        String methodName = method.getName();
        if("say".equals(methodName)){
            object = method.invoke(realObject,args);
        }
        System.out.println("代理对象结束代理之后");
        return object;
    }
}
