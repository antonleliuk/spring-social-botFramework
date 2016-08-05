package com.skype.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.AbstractRequestLoggingFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Anton Leliuk
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public RequestLoggingFilter loggingFilter(){
        return new RequestLoggingFilter();
    }

    private class RequestLoggingFilter extends AbstractRequestLoggingFilter {

        @Override
        protected void beforeRequest(HttpServletRequest request, String message) {
            StringBuilder sb = new StringBuilder(System.lineSeparator())
                    .append("-------------------").append(System.lineSeparator())
                    .append("URL = ").append(request.getRequestURI()).append(System.lineSeparator())
                    .append("Headers = ").append(request.getHeaderNames()).append(System.lineSeparator())
                    .append("Body = ").append(message).append(System.lineSeparator())
                    .append("-------------------");
            System.out.println(sb);
        }

        @Override
        protected void afterRequest(HttpServletRequest request, String message) {}
    }
}
