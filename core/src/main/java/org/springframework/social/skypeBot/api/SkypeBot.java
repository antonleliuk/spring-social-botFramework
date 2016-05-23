package org.springframework.social.skypeBot.api;

import org.springframework.social.ApiBinding;
import org.springframework.social.skypeBot.api.data.to.Message;

/**
 * @author Anton Leliuk
 */
public interface SkypeBot extends ApiBinding {

    void sendMessage(String skypeId, Message message);
}
