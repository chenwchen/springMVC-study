package spring.test;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Person{
   private String name;
   private int age;
//   @Autowired(required = false)
//   @Qualifier("hobby")
   private Hobby hobby;
    public String getName() {
        return name;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @Required
    public void setAge(int age) {
        this.age = age;
    }
    @Resource(name = "hobby1")
    public void setHobby(Hobby hobby){
        this.hobby = hobby;
    }

    public Hobby getHobby() {
        return hobby;
    }

    @PostConstruct
    public void init(){
        System.out.println("This is a init method");
        System.out.println("-------------------------------------------");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("-------------------------------------------");
        System.out.println("This is a destroy method");
    }

}
