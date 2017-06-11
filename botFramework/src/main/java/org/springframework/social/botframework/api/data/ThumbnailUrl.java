package org.springframework.social.botframework.api.data;

/**
 * Defines the URL to an image's source.
 * @author Anton Leliuk
 */
public class ThumbnailUrl {

    /**
     * Description of the image. You should include the description to support accessibility.
     */
    private String alt;

    /**
     * URL to the source of the image or the base64 binary of the image (for example, data:image/png;base64,iVBORw0KGgo...).
     */
    private String url;

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
