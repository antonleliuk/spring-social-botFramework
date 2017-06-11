package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.data.actions.Action;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.HorizontalAlignment;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.ImageStyle;

/**
 * The Image Item allows for the inclusion of images in an Adaptive Card.
 * @author Anton Leliuk
 */
public class Image extends CardElement {

    /**
     * Alternate text for the image for accessibility
     */
    private String altText;

    private HorizontalAlignment horizontalAlignment;

    private Action selectionAction;

    private ImageStyle style;

    /**
     * The URL to the image.
     */
    private String url;

    @Override
    public CardElementType getType() {
        return CardElementType.Image;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public HorizontalAlignment getHorizontalAlignment() {
        return horizontalAlignment;
    }

    public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
    }

    public Action getSelectionAction() {
        return selectionAction;
    }

    public void setSelectionAction(Action selectionAction) {
        this.selectionAction = selectionAction;
    }

    public ImageStyle getStyle() {
        return style;
    }

    public void setStyle(ImageStyle style) {
        this.style = style;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
