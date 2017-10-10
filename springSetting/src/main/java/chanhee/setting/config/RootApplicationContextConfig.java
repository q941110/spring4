package chanhee.setting.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "chanhee.setting.dao",
        "chanhee.setting.service"
})
@Import({DbConfig.class})
public class RootApplicationContextConfig {

}
