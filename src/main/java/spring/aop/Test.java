package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/Beans.xml");
        Student stu = (Student)context.getBean("student");
        stu.getName();
        stu.getAge();
        stu.printThrowException();
    }

}
