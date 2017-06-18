package org.springframework.social.directline.api.token;

import org.springframework.social.directline.api.DirectLine;
import org.springframework.social.directline.data.Conversation;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Use these operations to create or refresh a token that a client can use to access a single conversation.
 * @author Anton Leliuk
 */
public interface TokenOperations {

    /**
     * Generates a token that is valid for one conversation.
     * @return A {@link Conversation} object
     */
    Conversation generateToken();

    /**
     * Refreshes the token.
     * @return A {@link Conversation} object
     */
    Conversation refreshToken();

    static UriComponentsBuilder getBaseUrl(){
        return UriComponentsBuilder.fromHttpUrl(DirectLine.getBaseUrl().toUriString()).pathSegment("tokens");
    }
}
