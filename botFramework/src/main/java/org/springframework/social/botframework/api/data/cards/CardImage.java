package org.springframework.social.botframework.api.data.cards;

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

    public CardImage alt(String alt){
        this.alt = alt;
        return this;
    }

    public CardImage tap(CardAction tap){
        this.tap = tap;
        return this;
    }

    public CardImage url(String url){
        this.url = url;
        return this;
    }

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
