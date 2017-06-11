package org.springframework.social.botframework.api.data;

/**
 * Response with id of resource
 * @author Anton Leliuk
 */
public class ResourceResponse {

    /**
     * ID that uniquely identifies the resource.
     */
    private String id;

    /**
     * ID that uniquely identifies the activity.
     */
    private String activityId;

    /**
     * Service endpoint for the channel where operations for the conversation may be performed.
     */
    private String serviceUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }
}
