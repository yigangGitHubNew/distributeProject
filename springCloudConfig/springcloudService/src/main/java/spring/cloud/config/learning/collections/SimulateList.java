package spring.cloud.config.learning.collections;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.map.HashedMap;

import java.util.*;

import static java.util.Map.Entry.comparingByKey;

public class SimulateList {


    public static void main(String[] args) {
        //Map中的一些借口方法
//        Map<String,String> map = new HashMap<String, String>();
//        map.put("1","1" );
//        map.put("3","1" );
//        map.put("4","4" );
//        map.put("2","2" );
//        System.out.println(map);
//        Map<String, String> result = new LinkedHashMap<String, String>();
//        map.entrySet().stream().sorted(Map.Entry.<String, String>comparingByValue()).forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
//        System.out.println(result);

        //list集合的操作
//        List<String> list = new ArrayList<String>();
//        list.add("1");
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        System.out.println(list);
//        CollectionUtils.synchronizedCollection(list);

        //测试linkedList
        List<String> list = new LinkedList<String>();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
    }
}
