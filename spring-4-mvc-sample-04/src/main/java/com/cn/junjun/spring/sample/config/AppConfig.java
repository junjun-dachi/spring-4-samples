package com.cn.junjun.spring.sample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.cn.junjun.spring.sample.service", "com.cn.junjun.spring.sample.dao" })
public class AppConfig {

}
