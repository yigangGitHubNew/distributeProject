package org.spring.springboot.function;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public List<Person> creatPersonList(){
        List<Person> personList = new ArrayList<Person>();
        for(int i = 0; i < 10;i++){
            Person person = new Person();
            person.setAge(i);
            person.setName("wyg"+i);
            person.setGender("gener"+i);
            personList.add(person);
        }
        return personList;
    }

    //需求 根据姓名找到符合条件的person 普通的方法
    /*public List<Person> findByName(String name){
        List<Person> personList = new ArrayList<Person>();
        for(Person person:creatPersonList()){
            if(name.equals(person.getName())){
                personList.add(person);
            }
        }
        return personList;
    }
    public List<Person> findByGener(String gener){
        List<Person> personList = new ArrayList<Person>();
        for(Person person:creatPersonList()){
            if(gener.equals(gener)){
                personList.add(person);
            }
        }
        return personList;
    }*/

    // 需求 根据姓名找到符合条件的person 函数思想
    public List<Person> findByName(final String name){
        return find(matchPerson-> name.equals(matchPerson.getName()),creatPersonList());
    }

    public List<Person> findByGener(final String gener){
        return find(matchPerson-> gener.equals(matchPerson.getGender()),creatPersonList());
    }


    public List<Person> find(Criteria criteria,List<Person> personList){
        List<Person> personArrayList = new ArrayList<Person>();
        for(Person p:personList){
            if(criteria.matchs(p)){
                personArrayList.add(p);
            }
        }
        return personArrayList;
    }


    interface Criteria{
        boolean matchs(Person matchPerson);
    }

    public static void main(String[] args) {
        PersonService service = new PersonService();
        List<Person> person1s = service.findByGener("wyg1");
        List<Person> person2s = service.findByName("wyg1");
        System.out.println(person2s.size());
        if(CollectionUtils.isEmpty(person1s)){
            System.out.println("the list is empty");
        }
    }

}
