package spring.cloud.config.learning.collections;

/**
 * 模拟单项链表 添加单项链表 其实就是相当于在树上在建一个分支一样
 */
public class SimulateSingleLinked {

    Node head;

    transient int count;

    public SimulateSingleLinked(){
        head = null;
        count = 0;
    }

    /**
     * 新增数据
     * @param data
     */
    public void addData(Object data){
        Node node = new Node(data,null);
        Node temp = null;
        if(head != null){
            temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }else{
            head = node;
        }
        count++;
    }


    /**
     *  删除节点
     */
    public void delData(Object data){
        while(head.getNext() != null){
            if(data.equals(head.getData())){
                break;
            }
            head = head.getNext();
        }
        if(head != null){
            head = head.getNext();
        }
        count--;
    }

    public Object getData(int index){
        if(index < 0 || index > count - 1){
            System.out.println("链表的数组越界");
            return null;
        }
        Node temp = head;
        for(int i = 0;i<index;i++){
            temp = temp.getNext();
        }
        return temp.getData();
    }

    public void delByIndex(int index){
        if(index < 0 || index > count -1){
            System.out.println("链表的数组越界");
            return;
        }
        Node temp = null;
        temp = head;
        if(index == 0){
            head = head.getNext();
        }else{
            for(int i = 0;i<index-1;i++){
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        count--;

    }

    public int getSize(){
        return count;
    }









    class Node<T>{
        public T data;
        public Node<T> next;

        Node(T data,Node next){
            this.data = data;
            this.next = next;
        }

        Node(){}

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
