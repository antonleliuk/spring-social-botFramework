package org.springframework.social.botFramework.reactor.consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.botFramework.api.BotFramework;
import org.springframework.social.botFramework.api.data.Activity;

import reactor.bus.Event;
import reactor.bus.EventBus;
import reactor.fn.Consumer;
import reactor.fn.tuple.Tuple;

/**
 * @author Anton Leliuk
 */
public abstract class AbstractActivityConsumer implements Consumer<Event<Activity>> {

    protected static final Log log = LogFactory.getLog(AbstractActivityConsumer.class);

    @Autowired
    protected BotFramework botFramework;

    @Autowired
    protected EventBus eventBus;

    protected abstract void acceptInternal(Activity activity);

    @Override
    public void accept(Event<Activity> event) {
        try {
            acceptInternal(event.getData());
        } catch (Exception e) {
            log.error("Exception in consumer", e);
            eventBus.notify(e.getClass(), Event.wrap(Tuple.of(e, event)));
        }
    }

}
