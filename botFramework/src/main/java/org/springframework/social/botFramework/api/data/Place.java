package org.springframework.social.botFramework.api.data;

/**
 * Place (entity type: https://schema.org/Place)
 * @author Anton Leliuk
 */
public class Place {

    /**
     * Address of the place (may be `string` or complex object of type `PostalAddress`)
     */
    private Object address = null;

    /**
     * Geo coordinates of the place (may be complex object of type `GeoCoordinates` or `GeoShape`)
     */
    private Object geo = null;

    /**
     * Map to the place (may be `string` (URL) or complex object of type `Map`)
     */
    private Object hasMap = null;

    /**
     * The type of the thing
     */
    private String type = null;

    /**
     * The name of the thing
     */
    private String name = null;

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getGeo() {
        return geo;
    }

    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public Object getHasMap() {
        return hasMap;
    }

    public void setHasMap(Object hasMap) {
        this.hasMap = hasMap;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
