package org.springframework.social.common.api.dict;

/**
 * @author Anton Leliuk
 */
public enum CardType {

    RECEIPT_CARD("application/vnd.microsoft.card.receipt"),
    HERO_CARD("application/vnd.microsoft.card.hero"),
    SIGN_IN_CARD("application/vnd.microsoft.card.signin"),
    THUMBNAIL_CARD("application/vnd.microsoft.card.thumbnail");

    private String type;

    private CardType(String type) {
        this.type = type;
    }
}
