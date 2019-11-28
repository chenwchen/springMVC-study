package spring.annotation.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@SuppressWarnings("all")
@Configuration
@EnableAspectJAutoProxy
@Aspect
public class Logging {
    @Pointcut("execution(* com.annotation.aop.*.*(..))")
    private void selectAll(){

    }
    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("-------------before Advice------------");
    }

    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("-----------after Advice---------------");
    }

    @AfterReturning(pointcut = "selectAll()",returning = "retval")
    public void afterReturnningAdvice(Object retval){
        System.out.println("--------------afterReturnningAdvice " + retval + "------------");
    }

    @AfterThrowing(pointcut = "selectAll()",throwing = "ex")
    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("-----------afterThrowingAdvice" +ex.toString() + "-----------------");
    }


}
