package org.springframework.social.botframework.api.data.cards;

import java.util.ArrayList;
import java.util.List;

import org.springframework.social.botframework.api.dict.CardType;
import org.springframework.social.botframework.util.CollectionUtils;

/**
 * @author Anton Leliuk
 */
public class ThumbnailCard extends AbstractCard<ThumbnailCard> {

    /**
     * Set of actions applicable to the current card
     */
    private List<CardAction> buttons = new ArrayList<>();

    /**
     * List of the images
     */
    private List<CardImage> images = new ArrayList<>();

    /**
     * This action will be activated when user taps on the card itself
     */
    private CardAction tap;

    public ThumbnailCard button(CardAction button){
        this.buttons = CollectionUtils.add(buttons, button);
        return this;
    }

    public ThumbnailCard image(CardImage image){
        this.images = CollectionUtils.add(images, image);
        return this;
    }

    public ThumbnailCard tap(CardAction tap){
        this.tap = tap;
        return this;
    }

    @Override
    public CardType getCardType() {
        return CardType.THUMBNAIL_CARD;
    }

    public List<CardAction> getButtons() {
        return buttons;
    }

    public void setButtons(List<CardAction> buttons) {
        this.buttons = buttons;
    }

    public List<CardImage> getImages() {
        return images;
    }

    public void setImages(List<CardImage> images) {
        this.images = images;
    }

    public CardAction getTap() {
        return tap;
    }

    public void setTap(CardAction tap) {
        this.tap = tap;
    }

}
