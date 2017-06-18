package org.springframework.social.directline.data;

import org.springframework.social.botframework.api.data.Activity;

import java.util.List;

/**
 * Defines a set of activities.
 * @author Anton Leliuk
 */
public class ActivitySet {

    /**
     * Array of Activity objects
     */
    private List<Activity> activities;

    /**
     * Maximum watermark of activities within the set. A client may use the {@code watermark} value to indicate the most
     * recent message it has seen either when
     * <a href="https://docs.microsoft.com/en-us/bot-framework/rest-api/bot-framework-rest-direct-line-3-0-receive-activities#http-get">retrieving activities from the bot</a>
     * or when <a href="https://docs.microsoft.com/en-us/bot-framework/rest-api/bot-framework-rest-direct-line-3-0-reconnect-to-conversation">generating a new WebSocket stream URL</a>.
     */
    private String watermark;

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
}
