package org.springframework.social.directline.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a Direct Line conversation.
 * @author Anton Leliuk
 */
public class Conversation {

    /**
     * ID that uniquely identifies the conversation for which the specified token is valid.
     */
    private String conversationId;

    /**
     * Number of seconds until the token expires.
     */
    @JsonProperty("expires_in")
    private int expiresIn;

    /**
     * URL for the conversation's message stream.
     */
    private String serviceUrl;

    /**
     * Token that is valid for the specified conversation.
     */
    private String token;

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
