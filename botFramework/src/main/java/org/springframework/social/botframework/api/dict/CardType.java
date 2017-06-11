package org.springframework.social.botframework.api.dict;

/**
 * @author Anton Leliuk
 */
public enum CardType implements DictType {

    RECEIPT_CARD("application/vnd.microsoft.card.receipt"),
    HERO_CARD("application/vnd.microsoft.card.hero"),
    SIGN_IN_CARD("application/vnd.microsoft.card.signin"),
    THUMBNAIL_CARD("application/vnd.microsoft.card.thumbnail"),
    VIDEO_CARD("application/vnd.microsoft.card.video"),
    AUDIO_CARD("application/vnd.microsoft.card.audio"),
    ADAPTIVE_CARD("application/vnd.microsoft.card.adaptive"),
    ANIMATION_CARD("application/vnd.microsoft.card.animation");

    private String type;

    CardType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
