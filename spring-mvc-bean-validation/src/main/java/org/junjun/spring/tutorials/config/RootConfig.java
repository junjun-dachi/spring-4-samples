package org.junjun.spring.tutorials.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ AppConfig.class })
public class RootConfig {

}
