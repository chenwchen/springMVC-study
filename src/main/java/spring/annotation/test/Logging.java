package spring.annotation.test;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {
    @Pointcut("execution(* com.annotation.test.*.*(..))")
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
        System.out.println("--------------afterReturnningAdvice " + retval.toString() + "------------");
    }

    @AfterThrowing(pointcut = "selectAll()",throwing = "ex")
    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("-----------afterThrowingAdvice" +ex.toString() + "-----------------");
    }


}