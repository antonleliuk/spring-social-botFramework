package com.skype.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.botFramework.api.dict.ActivityType;
import org.springframework.social.botFramework.reactor.BotFrameworkConsumerDefinition;
import org.springframework.social.botFramework.reactor.consumer.ExceptionConsumer;
import org.springframework.social.botFramework.reactor.selector.ActivityByTypeSelector;
import com.skype.reactor.MessageActivityConsumer;
import com.skype.reactor.PingActivityConsumer;
import com.skype.reactor.TypingActivityConsumer;

import reactor.Environment;
import reactor.bus.EventBus;
import reactor.bus.selector.ClassSelector;

/**
 * @author Anton Leliuk
 */
@Configuration
public class ReactorConfig {

    @Bean
    public Environment env(){
        return Environment.initializeIfEmpty().assignErrorJournal();
    }

    @Bean
    public EventBus eventBus(Environment environment){
        return EventBus.create(environment, Environment.WORK_QUEUE);
    }

    @Bean
    public BotFrameworkConsumerDefinition<ActivityByTypeSelector, PingActivityConsumer> pingActivityDefinition(){
        return new BotFrameworkConsumerDefinition(new ActivityByTypeSelector(ActivityType.ping), pingActivityConsumer());
    }

    @Bean
    public PingActivityConsumer pingActivityConsumer() {
        return new PingActivityConsumer();
    }

    @Bean
    public BotFrameworkConsumerDefinition<ActivityByTypeSelector, TypingActivityConsumer> typingActivityDefinition(){
        return new BotFrameworkConsumerDefinition(new ActivityByTypeSelector(ActivityType.message), typingActivityConsumer());
    }

    @Bean
    public TypingActivityConsumer typingActivityConsumer() {
        return new TypingActivityConsumer();
    }

    @Bean
    public BotFrameworkConsumerDefinition<ActivityByTypeSelector, MessageActivityConsumer> messageActivityDefinition(){
        return new BotFrameworkConsumerDefinition(new ActivityByTypeSelector(ActivityType.message), messageActivityConsumer());
    }

    @Bean
    public MessageActivityConsumer messageActivityConsumer() {
        return new MessageActivityConsumer();
    }

    @Bean
    public BotFrameworkConsumerDefinition<ClassSelector, ExceptionConsumer> exceptionConsumerDefinition(){
        return new BotFrameworkConsumerDefinition<>(new ClassSelector(Exception.class), exceptionConsumer());
    }

    @Bean
    public ExceptionConsumer exceptionConsumer() {
        return new ExceptionConsumer();
    }
}
