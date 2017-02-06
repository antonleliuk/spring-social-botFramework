package org.springframework.social.botFramework.api.data;

/**
 * Response with id of resource
 * @author Anton Leliuk
 */
public class ResourceResponse {

    /**
     * Id of the resource
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
