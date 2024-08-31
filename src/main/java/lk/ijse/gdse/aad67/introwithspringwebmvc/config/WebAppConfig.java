package lk.ijse.gdse.aad67.introwithspringwebmvc.config;

import lk.ijse.gdse.aad67.introwithspringwebmvc.tmp.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.aad67.introwithspringwebmvc")
@EnableWebMvc
public class WebAppConfig {
    @Bean
    public MyBean myBean(){
        return new MyBean();
    }
}
