package org.springframework.social.botframework.api.data;

/**
 * Identifies a resource.
 * @author Anton Leliuk
 */
public class Identification {

    /**
     * ID that uniquely identifies the resource.
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
