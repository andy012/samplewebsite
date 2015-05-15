package com.doo.md5server.test.config;

import com.doo.md5server.config.DataSourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by lizhaoxin on 2/5/15.
 */

@Configuration
@Import({DataSourceConfig.class})
@PropertySource("classpath:application.properties")
public class DataSourceConfigTest {
}
