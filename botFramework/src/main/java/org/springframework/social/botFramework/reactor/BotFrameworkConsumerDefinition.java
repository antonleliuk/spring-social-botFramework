package org.springframework.social.botFramework.reactor;

/**
 * @author Anton Leliuk
 */
public class BotFrameworkConsumerDefinition<S, C> {

    private S selector;

    private C consumer;

    public BotFrameworkConsumerDefinition(S selector, C consumer) {
        this.selector = selector;
        this.consumer = consumer;
    }

    public S getSelector() {
        return selector;
    }

    public C getConsumer() {
        return consumer;
    }

}
