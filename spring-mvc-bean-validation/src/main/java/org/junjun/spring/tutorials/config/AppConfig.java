package org.junjun.spring.tutorials.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "org.junjun.spring.tutorials.service", "org.junjun.spring.tutorials.dao" })
public class AppConfig {

}
