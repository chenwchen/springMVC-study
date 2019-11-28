package spring.annotation.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/annotation/test/NewBeans.xml");
        NewStudent newStu = (NewStudent)context.getBean("newStudent");
        newStu.getName();
        newStu.getAge();
        newStu.printException();
    }


}
