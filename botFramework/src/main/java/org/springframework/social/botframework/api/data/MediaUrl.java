package org.springframework.social.botframework.api.data;

/**
 * Defines the URL to a media file's source.
 * @author Anton Leliuk
 */
public class MediaUrl {

    /**
     * Hint that describes the media's content.
     */
    private String profile;

    /**
     * URL to the source of the media file.
     */
    private String url;

    public MediaUrl profile(String profile){
        this.profile = profile;
        return this;
    }

    public MediaUrl url(String url){
        this.url = url;
        return this;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
