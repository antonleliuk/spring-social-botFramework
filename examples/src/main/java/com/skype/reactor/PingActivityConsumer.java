package com.skype.reactor;

import org.springframework.social.botFramework.api.data.Activity;
import org.springframework.social.botFramework.reactor.consumer.AbstractActivityConsumer;

/**
 * @author Anton Leliuk
 */
public class PingActivityConsumer extends AbstractActivityConsumer {

    @Override
    protected void acceptInternal(Activity activity) {}
}
