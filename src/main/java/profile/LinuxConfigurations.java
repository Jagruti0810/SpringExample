package profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("linuxProfile")
public class LinuxConfigurations {

    @Bean
    public LinuxBean getLinuxBean() {
        return new LinuxBean();
    }
}
