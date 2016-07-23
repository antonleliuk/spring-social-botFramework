package org.springframework.social.common.api.impl;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author Anton Leliuk
 */
public abstract class AbstractApiBinding {

    private String skypeUrl;
    private String apiVersion;

    private RestTemplate restTemplate;

    public AbstractApiBinding(RestTemplate restTemplate, String skypeUrl, String apiVersion) {
        this.restTemplate = restTemplate;
        this.skypeUrl = skypeUrl;
        this.apiVersion = apiVersion;
    }

    protected UriComponentsBuilder buildConversationUrl(String skypeId){
        return getMainUrl().pathSegment("conversations", skypeId);
    }

    protected UriComponentsBuilder getMainUrl() {
        return UriComponentsBuilder.fromHttpUrl(skypeUrl).pathSegment(apiVersion);
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }
}
