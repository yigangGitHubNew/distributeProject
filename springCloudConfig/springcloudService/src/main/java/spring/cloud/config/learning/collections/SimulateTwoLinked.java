package spring.cloud.config.learning.collections;

public class SimulateTwoLinked {

    transient int size = 0;
    Node head;

    public int getSize(){
        return size;
    }

    /**
     * 插入数据
     * @param object
     */
    public void addData(Object object){
        Node node = new Node(null,object,null);
        if(size == 0){
            head = new Node();
            this.head.setTail(node);
            node.setPre(head);
        }else{
            if(head.getTail() != null){
                head = head.getTail();
            }
            head.setTail(node);
            node.setPre(head);
        }
        size++;
    }

    /**
     * 根据索引获取数据
     * @param index
     * @return
     */
    public Object get(int index){
        if(index < 0 || index > size-1){
            System.out.println("双向链表越界");
            return null;
        }
        if(head == null){
            System.out.println("双向链表还没有数据");
            return null;
        }
        Node temp = head;
        if(index == 0){
            return temp.getData();
        }else{
            for(int i = 0; i < index-1;i++){
                temp = temp.getTail();
            }
            return temp.getData();
        }
    }




    class Node<T>{
        Node pre;
        T data;
        Node tail;

        Node(){}

        Node(Node pre,T data,Node tail){
            this.pre = pre;
            this.data = data;
            this.tail = tail;
        }

        public Node getPre() {
            return pre;
        }

        public void setPre(Node pre) {
            this.pre = pre;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getTail() {
            return tail;
        }

        public void setTail(Node tail) {
            this.tail = tail;
        }
    }
}
