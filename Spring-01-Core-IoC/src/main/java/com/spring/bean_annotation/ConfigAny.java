package com.spring.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//
@Configuration
public class ConfigAny {

    @Bean
    String str() {
        return "Dev";
    }

    @Bean
    Integer number() {
        return 7;
    }
}
