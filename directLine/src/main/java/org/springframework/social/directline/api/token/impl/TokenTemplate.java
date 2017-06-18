package org.springframework.social.directline.api.token.impl;

import org.springframework.social.directline.api.token.TokenOperations;
import org.springframework.social.directline.data.Conversation;
import org.springframework.web.client.RestTemplate;

/**
 * @author Anton Leliuk
 */
public class TokenTemplate implements TokenOperations {

    private RestTemplate restTemplate;

    public TokenTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Conversation generateToken() {
        return restTemplate.postForObject(TokenOperations.getBaseUrl().pathSegment("generate").build().toUri(), null, Conversation.class);
    }

    public Conversation refreshToken() {
        return restTemplate.postForObject(TokenOperations.getBaseUrl().pathSegment("refresh").build().toUri(), null, Conversation.class);
    }
}
