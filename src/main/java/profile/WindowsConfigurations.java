package profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("windowsProfile")
public class WindowsConfigurations {
    @Bean
    public WindowsBean getWindowsBean() {
        return new WindowsBean();
    }
}
