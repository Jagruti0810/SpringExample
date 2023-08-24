package beanmethod;

import org.springframework.beans.factory.InitializingBean;

public class MyBean {
//        implements InitializingBean {
    public void init() {
        System.out.println("Bean initialization logic");
    }

    public void destroy() {
        System.out.println("Bean cleanup logic");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Welcome");
//    }
}
