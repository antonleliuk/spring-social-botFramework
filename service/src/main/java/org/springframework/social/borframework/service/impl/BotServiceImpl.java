package org.springframework.social.borframework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.borframework.service.ActivityProcessorCallback;
import org.springframework.social.borframework.service.BotService;
import org.springframework.social.botframework.api.BotFramework;
import org.springframework.social.botframework.api.data.Activity;

/**
 * @author Anton Leliuk
 */
public class BotServiceImpl implements BotService {

    @Autowired
    private BotFramework botFramework;

    @Override
    public void process(Activity activity, ActivityProcessorCallback callback){
        switch (activity.getActivity()){
            case message:
                if(activity.getConversation().isGroup()){
                    callback.onGroupMessage(activity);
                } else {
                    callback.onPersonalMessage(activity);
                }
                break;
            case contactRelationUpdate:
                callback.onContactRelationUpdate(activity);
                break;
            case conversationUpdate:
                callback.onConversationUpdate(activity);
                break;
            case ping:
                callback.onPing(activity);
                break;
            case deleteUserData:
                callback.onDeleteUserData(activity);
                break;
            case endOfConversation:
                callback.onEndOfConversation(activity);
                break;
        }
    }

    @Override
    public void typing(Activity activity) {
        reply(activity.createReplay().typing());
    }

    @Override
    public void reply(Activity answer) {
        botFramework.sendToConversation(answer.getServiceUrl(), answer.getConversation().getId(), answer);
    }
}
