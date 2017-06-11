package org.springframework.social.borframework.service;

import org.springframework.social.botframework.api.data.Activity;

/**
 * @author Anton Leliuk
 */
public interface BotService {

    void process(Activity activity, ActivityProcessorCallback callback);

    void typing(Activity activity);

    void reply(Activity answer);
}
