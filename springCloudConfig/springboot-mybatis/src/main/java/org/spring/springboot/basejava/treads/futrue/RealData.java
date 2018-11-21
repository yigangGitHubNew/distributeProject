package org.spring.springboot.basejava.treads.futrue;

public class RealData implements Data{

    private String result = null;

    public RealData(String param){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(param);
        try {
            System.out.println("在组装真实的数据，当前的线程名称为："+Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        result = stringBuffer.toString();
    }

    @Override
    public String getRequest() {
        return result;
    }
}
