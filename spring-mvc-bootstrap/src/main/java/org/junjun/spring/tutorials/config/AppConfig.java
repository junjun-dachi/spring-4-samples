package org.junjun.spring.tutorials.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan({ "org.junjun.spring.tutorials.web" })
public class AppConfig {

}
