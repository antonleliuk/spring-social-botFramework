package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Anton Leliuk
 */
public class Choice {

    /**
     * The text for a choice
     */
    private String title;

    /**
     * Is the choice selected
     */
    @JsonProperty("isSelected")
    private boolean selected;

    /**
     * The raw value for the choice
     */
    private String value;

    public Choice title(String title){
        this.title = title;
        return this;
    }

    public Choice selected(boolean selected){
        this.selected = selected;
        return this;
    }

    public Choice value(String value){
        this.value = value;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
