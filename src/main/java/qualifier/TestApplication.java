package qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MessageProcessor processor = applicationContext.getBean(MessageProcessor.class);
        processor.processMsg("twitter message sending");
    }
}
