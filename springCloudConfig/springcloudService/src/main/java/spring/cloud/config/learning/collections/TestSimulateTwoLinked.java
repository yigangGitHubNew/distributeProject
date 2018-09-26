package spring.cloud.config.learning.collections;

public class TestSimulateTwoLinked {

    public static void main(String[] args) {
        SimulateTwoLinked simulateTwoLinked = new SimulateTwoLinked();
        simulateTwoLinked.addData("0");
        simulateTwoLinked.addData("1");
        simulateTwoLinked.addData("2");
        simulateTwoLinked.addData("3");
        simulateTwoLinked.addData("4");
        System.out.println("双向链表的总数："+simulateTwoLinked.size);
        System.out.println("获取双向链表的对象值："+simulateTwoLinked.get(3));
    }
}
