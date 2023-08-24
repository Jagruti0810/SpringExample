package propertysource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAnnotationApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringAnnotationApplication.class, args);

        PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);

        System.out.println("Host: " + propertySourceDemo.getHost());
        System.out.println("Email: " + propertySourceDemo.getEmail());

    }
}