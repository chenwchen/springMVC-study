package spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("/Beans-3.xml");
        Student stu = (Student)context.getBean("student");
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getSex());
        for(String item:stu.getMyList()){
            System.out.println(item);
        }
        for(String item:stu.getMySet()){
            System.out.println(item);
        }
        Map<String,String> myMap = stu.getMyMap();
        for(String key : myMap.keySet()){
            System.out.println(key + " : " + myMap.get(key));
        }
        Properties prop = stu.getProp();
        Enumeration<Object> keys = prop.keys();
        while(keys.hasMoreElements()){
            System.out.println(prop.getProperty((String)keys.nextElement()));
        }
        System.out.println("-----------------------------");
        Person person = (Person)context.getBean("person");
        System.out.println("name : " + person.getName());
        System.out.println("age : "+ person.getAge());
        person.getHobby().show();
        context.registerShutdownHook();

        System.out.println("-----------------------------");


        AnnotationConfigApplicationContext annotationContext =
                new AnnotationConfigApplicationContext("com.test");
        annotationContext.start();
        Student stu2 = (Student)annotationContext.getBean("student");
        System.out.println(stu2.getName());
        annotationContext.stop();
        System.out.println("------------------------------");








    }

}
