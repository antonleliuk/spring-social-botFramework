package org.springframework.social.botFramework.api.data.cards;

/**
 * @author Anton Leliuk
 */
public class CardImage {

    /**
     * Image description intended for screen readers
     */
    private String alt;

    /**
     * Action assigned to specific Attachment.E.g.navigate to specific URL or play/open media content
     */
    private CardAction tap;

    /**
     * URL Thumbnail image for major content property
     */
    private String url;

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public CardAction getTap() {
        return tap;
    }

    public void setTap(CardAction tap) {
        this.tap = tap;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
