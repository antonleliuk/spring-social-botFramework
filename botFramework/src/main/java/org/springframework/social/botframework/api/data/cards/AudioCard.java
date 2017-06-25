package org.springframework.social.botframework.api.data.cards;

import org.springframework.social.botframework.api.dict.CardType;

/**
 * Defines a card that can play an audio file.
 * @author Anton Leliuk
 */
public class AudioCard extends MultimediaCard<AudioCard> {

    @Override
    public CardType getCardType() {
        return CardType.AUDIO_CARD;
    }
}
