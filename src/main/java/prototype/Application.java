package prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService messageService = context.getBean(MessageService.class);
        messageService.setMessage("TwitterMessageService Implementation");
        System.out.println(messageService.getMessage());
        System.out.println(messageService.hashCode());

        MessageService messageService1 = context.getBean(MessageService.class);
        System.out.println(messageService1.getMessage());
        System.out.println(messageService1.hashCode());
        context.close();
    }
}
