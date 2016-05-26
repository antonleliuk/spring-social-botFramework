package com.skype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Anton Leliuk
 */
@SpringBootApplication
@EnableConfigurationProperties
@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true)
@PropertySource(value = "file:${catalina.home}/conf/skype-application.properties", ignoreResourceNotFound = true)
public class SkypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkypeApplication.class, args);
    }
}
