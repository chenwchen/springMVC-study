package spring.annotation.aop;

import org.springframework.context.annotation.Configuration;
@Configuration
public class Student {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void printException(){
        System.out.println("This is a Exception");
        throw new IllegalArgumentException();
    }
}
