package spring.cloud.config.learning.collections;

import com.alibaba.fastjson.JSONArray;

/**
 * 测试单项链表的测试类
 */
public class TestSimulateSingleLinked {

    public static void main(String[] args) {
        SimulateSingleLinked singleLinked = new SimulateSingleLinked();
        singleLinked.addData("0");
        singleLinked.addData("1");
        singleLinked.addData("2");
        singleLinked.addData("3");
//        System.out.println("添加操作的数量");
//        System.out.println(singleLinked.getSize());
//        System.out.println(JSONArray.toJSONString(singleLinked));
//        System.out.println("删除操作的数量");
//        singleLinked.delData("0");
//        System.out.println(singleLinked.getSize());
//        System.out.println(JSONArray.toJSONString(singleLinked));
//        System.out.println("获取数据操作的数量");
//        Object object = singleLinked.getData(0);
//        System.out.println(singleLinked.getSize());
//        System.out.println(object.toString());
//        System.out.println("循环获取数据");
//        for(int i = 0;i<singleLinked.getSize();i++){
//            System.out.println("数值为："+singleLinked.getData(i).toString());
//        }
//        System.out.println(singleLinked.getSize());

        System.out.println("根据索引删除数据");
        singleLinked.delByIndex(1);
        System.out.println("该方法已完成");

//        TreeNode treeNode = new TreeNode("0",null);
//        TreeNode treeNode1 = new TreeNode("1",treeNode);
//        TreeNode treeNode2 = new TreeNode("2",treeNode1);
//        TreeNode treeNode3 = new TreeNode("3",treeNode2);
//        int count = 0;
//        while (treeNode3.getTreeNode()!=null){
//            treeNode3 = treeNode3.getTreeNode();
//            count++;
//        }
//        System.out.println(count);
    }

    static class TreeNode{
        String data;
        TreeNode treeNode;

        TreeNode(String data,TreeNode treeNode){
            this.data = data;
            this.treeNode = treeNode;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public TreeNode getTreeNode() {
            return treeNode;
        }

        public void setTreeNode(TreeNode treeNode) {
            this.treeNode = treeNode;
        }
    }
}
