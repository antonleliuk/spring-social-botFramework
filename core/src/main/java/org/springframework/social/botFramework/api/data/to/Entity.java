package org.springframework.social.botFramework.api.data.to;

/**
 * Object of schema.org types
 * @author Anton Leliuk
 */
public class Entity {

    private Object properties;

    private String type;

    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
