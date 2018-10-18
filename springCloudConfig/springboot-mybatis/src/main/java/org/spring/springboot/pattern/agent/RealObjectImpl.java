package org.spring.springboot.pattern.agent;

import org.spring.springboot.pattern.agent.imitationaop.Imitation;

/**
 *  真实对象
 * @author yigang.wu
 * @date created in $time $date
 */
@Imitation
public class RealObjectImpl implements RealObject{

    public void say(){
        System.out.println("real Object say something");
    }

    public void print(){
        System.out.println("real Object want to print something");
    }
}
