package org.springframework.social.botframework.api.data;

/**
 * Place (entity type: https://schema.org/Place)
 * @author Anton Leliuk
 */
public class Place implements Entity {

    /**
     * Geo coordinates of the place (may be complex object of type `GeoCoordinates` or `GeoShape`)
     */
    private GeoCoordinates geo = null;

    /**
     * This object's type. Always set to Place.
     */
    private String type = null;

    /**
     * Name of the place.
     */
    private String name = null;

    public GeoCoordinates getGeo() {
        return geo;
    }

    public void setGeo(GeoCoordinates geo) {
        this.geo = geo;
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
