package spring.aop;

import javax.xml.bind.SchemaOutputResolver;

public class Logging {
    /**
     * 之前通知
     */
    public void beforeAdvice(){
        System.out.println("------------beforeAdvice---------------");
    }

    /**
     * 之后通知
     */
    public void afterAdvice(){
        System.out.println("-----------afterAdvice------------");
    }

    /**
     * 返回后通知
     */

    public void afterReturningAdvice(Object retval){
        System.out.println("-----------afterReturningAdvice "+ retval.toString() + "---------------");
    }

    /**
     * 抛出异常后通知
     * @param e
     */
    public void afterThrowingAdvice(IllegalArgumentException e){
        System.out.println("-----------afterThrowingAdvice " + e.toString() + "-----------------");
    }


}
