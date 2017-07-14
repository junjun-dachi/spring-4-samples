package org.junjun.spring.tutorials.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "org.junjun.spring.tutorials.service", "org.junjun.spring.tutorials.dao" })
public class AppConfig {

}


// http://localhost:8080/spring-mvc-oauth2/oauth/token?grant_type=password&client_id=apiuser&client_secret=apipassword&username=springuser&password=springpassword  
// http://localhost:8080/spring-mvc-oauth2/oauth/authorize?response_type=code&client_id=apiuser&redirect_uri=http://client_host?key=value&scope=read