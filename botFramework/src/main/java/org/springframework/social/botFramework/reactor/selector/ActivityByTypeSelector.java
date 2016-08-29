package org.springframework.social.botFramework.reactor.selector;

import java.util.Arrays;

import org.springframework.social.botFramework.api.dict.ActivityType;

import reactor.bus.selector.HeaderResolver;
import reactor.bus.selector.Selector;

/**
 * @author Anton Leliuk
 */
public class ActivityByTypeSelector implements Selector<ActivityType> {

    private ActivityType[] types;

    public ActivityByTypeSelector(ActivityType... types) {
        this.types = types;
        Arrays.sort(types);
    }

    @Override
    public Object getObject() {
        return types;
    }

    @Override
    public boolean matches(ActivityType key) {
        return Arrays.binarySearch(types, key) > -1;
    }

    @Override
    public HeaderResolver getHeaderResolver() {
        return null;
    }
}
