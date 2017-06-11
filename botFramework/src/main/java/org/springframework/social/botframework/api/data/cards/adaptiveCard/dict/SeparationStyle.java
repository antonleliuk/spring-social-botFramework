package org.springframework.social.botframework.api.data.cards.adaptiveCard.dict;

import org.springframework.social.botframework.api.dict.DictType;

/**
 * Controls how Items are rendered relative to previous elements.
 * @author Anton Leliuk
 */
public enum SeparationStyle implements DictType {

    DEFAULT("default"), NONE("none"), STRONG("strong");

    private String type;

    SeparationStyle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
