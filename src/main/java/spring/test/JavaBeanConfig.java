package spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaBeanConfig {
    @Bean(name = "student")
    public Student Student(){
        return new Student("chen",21);
    }
    @Bean
    public CStartListener cStartListener(){
        return new CStartListener();
    }
    @Bean
    public CStopListener cStopListener(){
        return new CStopListener();
    }


}
