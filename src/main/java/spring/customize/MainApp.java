package spring.customize;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext("com.customize");
        CustomEventPublisher cvp = context.getBean(CustomEventPublisher.class);
        cvp.publisher();
        cvp.publisher();
    }
}
