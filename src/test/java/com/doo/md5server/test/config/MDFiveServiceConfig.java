package com.doo.md5server.test.config;

import com.doo.md5server.service.MDFIVEService;
import com.doo.md5server.service.MDFIVEServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 15-5-1.
 */
@Configuration
public class MDFiveServiceConfig {
    @Bean
    public MDFIVEService mDFIVEService(){
        return new MDFIVEServiceImpl();
    }
}
