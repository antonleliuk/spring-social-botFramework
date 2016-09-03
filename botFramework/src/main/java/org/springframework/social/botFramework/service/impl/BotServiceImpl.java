package org.springframework.social.botFramework.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.botFramework.api.data.Activity;
import org.springframework.social.botFramework.reactor.BotFrameworkConsumerDefinition;
import org.springframework.social.botFramework.service.BotService;

import reactor.bus.Event;
import reactor.bus.EventBus;
import reactor.bus.selector.Selector;
import reactor.fn.Consumer;

/**
 * @author Anton Leliuk
 */
public class BotServiceImpl implements BotService {

    @Autowired
    private EventBus eventBus;

    @Autowired
    public <S extends Selector, C extends Consumer> void initializeConsumers(Collection<BotFrameworkConsumerDefinition<S, C>> definitions){
        definitions.stream().forEach(d -> eventBus.on(d.getSelector(), d.getConsumer()));
    }

    public void reply(Activity activity){
        eventBus.notify(activity.getType(), Event.wrap(activity));
    }
}
