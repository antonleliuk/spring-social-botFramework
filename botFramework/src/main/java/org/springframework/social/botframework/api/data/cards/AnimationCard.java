package org.springframework.social.botframework.api.data.cards;

import org.springframework.social.botframework.api.dict.CardType;

/**
 * Defines a card that can play animated GIFs or short videos.
 * @author Anton Leliuk
 */
public class AnimationCard extends MultimediaCard {

    @Override
    public CardType getCardType() {
        return CardType.ANIMATION_CARD;
    }
}
