package com.cn.junjun.spring.sample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.cn.junjun.spring.sample.service", "com.cn.junjun.spring.sample.dao" })
public class AppConfig {

}


// http://localhost:8080/spring-4-mvc-sample-05/oauth/token?grant_type=password&client_id=apiuser&client_secret=apipassword&username=springuser&password=springpassword  
// http://localhost:8080/spring-4-mvc-sample-05/oauth/authorize?response_type=code&client_id=apiuser&redirect_uri=http://client_host?key=value&scope=read