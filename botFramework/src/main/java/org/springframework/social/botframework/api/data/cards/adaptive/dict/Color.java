package org.springframework.social.botframework.api.data.cards.adaptive.dict;

import org.springframework.social.botframework.api.dict.DictType;

/**
 * @author Anton Leliuk
 */
public enum Color implements DictType {

    DEFAULT("default"),
    DARK("dark"),
    LIGHT("light"),
    ACCENT("accent"),
    GOOD("good"),
    WARNING("warning"),
    ATTENTION("attention");

    private String type;

    Color(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
