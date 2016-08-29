package org.springframework.social.botFramework.reactor.consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.botFramework.api.BotFramework;
import org.springframework.social.botFramework.api.data.Activity;
import org.springframework.social.botFramework.api.dict.ActivityType;

import reactor.bus.Event;
import reactor.fn.Consumer;
import reactor.fn.tuple.Tuple2;

/**
 * @author Anton Leliuk
 */
public class ExceptionConsumer implements Consumer<Event<Tuple2<Exception, Event<Activity>>>> {

    private static final Log log = LogFactory.getLog(ExceptionConsumer.class);

    @Autowired
    private BotFramework botFramework;

    @Override
    public void accept(Event<Tuple2<Exception, Event<Activity>>> event) {
        Tuple2<Exception, Event<Activity>> tuple = event.getData();
        Exception e = tuple.getT1();
        log.error(e.getMessage(), e);

        Activity activity = tuple.getT2().getData();
        Activity answer = activity.createReplay();
        answer.setType(ActivityType.text_message);
        answer.setText("I'm sorry, but I can't process your message. An error hs occurred.");

        botFramework.sendToConversation(answer.getRecipient().getId(), answer);
    }
}
