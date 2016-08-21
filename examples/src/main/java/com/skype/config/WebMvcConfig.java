package com.skype.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.github.isrsal.logging.LoggingFilter;

/**
 * @author Anton Leliuk
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public LoggingFilter loggingFilter(){
        return new LoggingFilter();
    }
}
