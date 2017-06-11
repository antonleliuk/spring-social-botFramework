package org.springframework.social.botframework.api.data.cards;

/**
 * @author Anton Leliuk
 */
public class CardImage {

    /**
     * Description of the image. You should include the description to support accessibility.
     */
    private String alt;

    /**
     * A CardAction object that specifies the action to perform if the user taps or clicks the image.
     */
    private CardAction tap;

    /**
     * URL to the source of the image or the base64 binary of the image (for example, data:image/png;base64,iVBORw0KGgo...).
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
