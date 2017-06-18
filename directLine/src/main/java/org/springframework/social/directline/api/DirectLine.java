package org.springframework.social.directline.api;

import org.springframework.social.ApiBinding;
import org.springframework.social.directline.api.conversation.ConversationOperations;
import org.springframework.social.directline.api.token.TokenOperations;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author Anton Leliuk
 */
public interface DirectLine extends ApiBinding {

    String BASE_URL = "https://directline.botframework.com";
    String VERSION = "v3";

    TokenOperations getTokenOperations();

    ConversationOperations getConversationOperations();

    static UriComponentsBuilder getBaseUrl(){
        return UriComponentsBuilder.fromHttpUrl(BASE_URL).pathSegment(VERSION).pathSegment("directline");
    }
}
