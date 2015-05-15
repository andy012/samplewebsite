package com.doo.md5server.test.config;

import com.doo.md5server.service.UserJPAServiceImpl;
import com.doo.md5server.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by andydoo on 15-4-27.
 */
@Configuration
public class UserServiceConfig {
    @Bean
    public UserService userJPAServiceImpl() {
        return new UserJPAServiceImpl();
    }
}
