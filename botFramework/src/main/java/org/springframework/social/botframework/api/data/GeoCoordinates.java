package org.springframework.social.botframework.api.data;

/**
 * GeoCoordinates (entity type: \&quot;https://schema.org/GeoCoordinates\&quot;)
 * @author Anton Leliuk
 */
public class GeoCoordinates {

    /**
     * Elevation of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)
     */
    private Double elevation = null;

    /**
     * Latitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)
     */
    private Double latitude = null;

    /**
     * Longitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)
     */
    private Double longitude = null;

    /**
     * The type of the thing
     */
    private String type = null;

    /**
     * The name of the thing
     */
    private String name = null;

    public Double getElevation() {
        return elevation;
    }

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
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
