package org.springframework.social.common.api.impl;

import org.springframework.social.botFramework.api.BotFrameworkOperations;
import org.springframework.social.botFramework.api.impl.BotFrameworkTemplate;
import org.springframework.social.common.api.ConnectorClient;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.skypeBot.api.SkypeBotOperations;
import org.springframework.social.skypeBot.api.impl.SkypeBotTemplate;
import org.springframework.social.support.ClientHttpRequestFactorySelector;

/**
 * @author Anton Leliuk
 */
public class ConnectorClientTemplate extends AbstractOAuth2ApiBinding implements ConnectorClient {

    private String skypeUrl;
    private String apiVersion;

    private SkypeBotOperations skypeBotOperations;

    private BotFrameworkOperations botFrameworkOperations;

    public ConnectorClientTemplate(String accessToken, String skypeUrl, String apiVersion) {
        super(accessToken);
        this.skypeUrl = skypeUrl;
        this.apiVersion = apiVersion;
        initialize();
    }

    @Override
    public SkypeBotOperations getSkypeBotOperations() {
        return skypeBotOperations;
    }

    @Override
    public BotFrameworkOperations getBotFrameworkOperations() {
        return botFrameworkOperations;
    }

    // private helpers
    private void initialize() {
        // Wrap the request factory with a BufferingClientHttpRequestFactory so that the error handler can do repeat reads on the response.getBody()
        super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
        initSubApis();
    }

    private void initSubApis() {
        this.skypeBotOperations = new SkypeBotTemplate(getRestTemplate(), skypeUrl, apiVersion);
        this.botFrameworkOperations = new BotFrameworkTemplate(getRestTemplate(), skypeUrl, apiVersion);
    }

}
