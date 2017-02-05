package com.skype.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author Anton Leliuk
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2AuthConfig extends AuthorizationServerConfigurerAdapter {


}
