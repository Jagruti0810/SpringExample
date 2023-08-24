package profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Demo {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = null;
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        if (context.getEnvironment().getProperty("os.name").contains("Windows")) {
            System.setProperty("spring.profiles.active", "windowsProfile");
            context.register(WindowsConfigurations.class);
            context.refresh();
            operatingSystem = (WindowsBean) context.getBean("getWindowsBean");
        }
        if (context.getEnvironment().getProperty("os.name").contains("Linux")) {
            System.setProperty("spring.profiles.active", "linuxProfile");
            context.register(LinuxConfigurations.class);
            context.refresh();
            operatingSystem = (WindowsBean) context.getBean("getLinuxBean");
        }
        if (operatingSystem != null ) {
            operatingSystem.printOSName();
        }
        context.close();
    }
}

//@Configuration
//public class Demo {
//    @Autowired
//    OperatingSystem operatingSystem;
//    public static void main(String[] args) {
//        System.setProperty("spring.profiles.active", "linux");
//        //System.setProperty("spring.profiles.active", "winodws");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.java4coding");
//        Demo demo = (Demo)context.getBean("demo");
//        demo.operatingSystem.printOSName();
//        context.close();
//    }
//}
