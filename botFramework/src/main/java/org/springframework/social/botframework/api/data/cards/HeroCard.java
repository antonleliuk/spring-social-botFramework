package org.springframework.social.botframework.api.data.cards;

import org.springframework.social.botframework.api.dict.CardType;
import org.springframework.social.botframework.util.CollectionUtils;

import java.util.List;

/**
 * @author Anton Leliuk
 */
public class HeroCard extends AbstractCard<HeroCard> {

    /**
     * Set of actions applicable to the current card
     */
    private List<CardAction> buttons;

    /**
     * List of the images
     */
    private List<CardImage> images;

    /**
     * This action will be activated when user taps on the card itself
     */
    private CardAction tap;

    @Override
    public CardType getCardType() {
        return CardType.HERO_CARD;
    }

    public HeroCard button(CardAction button){
        buttons = CollectionUtils.add(buttons, button);
        return this;
    }

    public HeroCard image(CardImage image){
        images = CollectionUtils.add(images, image);
        return this;
    }

    public HeroCard tap(CardAction tap){
        this.tap = tap;
        return this;
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
