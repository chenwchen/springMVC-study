package spring.annotation.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.annotation.aop");
        Student stu = context.getBean(Student.class);
        stu.getName();
        stu.getAge();
        stu.printException();


    }
}
