package org.springframework.social.botFramework.reactor.selector;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.social.botFramework.api.dict.ActivityType;

/**
 * @author Anton Leliuk
 */
public class ActivityByTypeSelectorTest {

    @Test
    public void select(){
        ActivityByTypeSelector selector = new ActivityByTypeSelector(ActivityType.message, ActivityType.typing);
        Assert.assertFalse(selector.matches(ActivityType.attachment));
        Assert.assertTrue(selector.matches(ActivityType.message));
        Assert.assertTrue(selector.matches(ActivityType.typing));

        selector = new ActivityByTypeSelector(ActivityType.typing, ActivityType.message);
        Assert.assertFalse(selector.matches(ActivityType.attachment));
        Assert.assertTrue(selector.matches(ActivityType.message));
        Assert.assertTrue(selector.matches(ActivityType.typing));
    }
}
