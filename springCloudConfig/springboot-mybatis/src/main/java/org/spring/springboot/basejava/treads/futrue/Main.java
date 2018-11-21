package org.spring.springboot.basejava.treads.futrue;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        Data data = client.getData("真实的数据");
        System.out.println("请求完毕");
        try {
            Thread.sleep(1000);
            System.out.println("做其他的业务");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("真是的数据是："+data.getRequest());

    }
}
