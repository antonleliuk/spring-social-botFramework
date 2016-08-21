package org.springframework.social.botFramework.api.data.to.cards;

import java.util.ArrayList;
import java.util.List;

import org.springframework.social.botFramework.api.dict.CardType;

/**
 * @author Anton Leliuk
 */
public class HeroCard extends AbstractCard {

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

    @Override
    public CardType getCardType() {
        return CardType.HERO_CARD;
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
