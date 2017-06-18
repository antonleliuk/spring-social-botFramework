package org.springframework.social.directline.api.impl;

import org.springframework.social.directline.api.DirectLine;
import org.springframework.social.directline.api.conversation.ConversationOperations;
import org.springframework.social.directline.api.conversation.impl.ConversationTemplate;
import org.springframework.social.directline.api.token.TokenOperations;
import org.springframework.social.directline.api.token.impl.TokenTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.ClientHttpRequestFactorySelector;

/**
 * @author Anton Leliuk
 */
public class DirectLineTemplate extends AbstractOAuth2ApiBinding implements DirectLine {

    private TokenOperations tokenOperations;
    private ConversationOperations conversationOperations;

    public DirectLineTemplate(String accessToken) {
        super(accessToken);
        super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
        this.tokenOperations = new TokenTemplate(getRestTemplate());
        this.conversationOperations = new ConversationTemplate(getRestTemplate());
    }

    @Override
    public TokenOperations getTokenOperations() {
        return tokenOperations;
    }

    @Override
    public ConversationOperations getConversationOperations() {
        return conversationOperations;
    }
}
