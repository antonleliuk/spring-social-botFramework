package org.springframework.social.botframework.api.data.cards;

import org.springframework.social.botframework.api.dict.CardType;

/**
 * Defines a card that can play videos.
 * @author Anton Leliuk
 */
public class VideoCard extends MultimediaCard {

    @Override
    public CardType getCardType() {
        return CardType.VIDEO_CARD;
    }


}
