package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.Color;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.HorizontalAlignment;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.Size;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.Weight;
import org.springframework.social.botframework.api.json.DictTypeSerializer;

/**
 * The TextBlock Item allows for the inclusion of text, with various font sizes, weight and color, in Adaptive Cards.
 * @author Anton Leliuk
 */
public class TextBlock extends CardElement {

    /**
     * Controls the color of TextBlock Items.
     */
    @JsonSerialize(using = DictTypeSerializer.class)
    private Color color;

    private HorizontalAlignment horizontalAlignment;

    /**
     * Indicates whether the color of the text should be slightly toned down to appear less prominent
     */
    @JsonProperty("isSubtle")
    private boolean subtle;

    /**
     * When Wrap is true, you can specify the maximum number of lines to allow the textBlock to use.
     */
    private int maxLines;

    /**
     * Controls size of the text.
     */
    private Size size;

    /**
     * The actual text to display
     */
    private String text;

    /**
     * Controls the weight of TextBlock Items
     */
    private Weight weight;

    /**
     * True if be is allowed to wrap
     */
    private boolean wrap;

    @Override
    public CardElementType getType() {
        return CardElementType.TextBlock;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public HorizontalAlignment getHorizontalAlignment() {
        return horizontalAlignment;
    }

    public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
    }

    public boolean isSubtle() {
        return subtle;
    }

    public void setSubtle(boolean subtle) {
        this.subtle = subtle;
    }

    public int getMaxLines() {
        return maxLines;
    }

    public void setMaxLines(int maxLines) {
        this.maxLines = maxLines;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public boolean isWrap() {
        return wrap;
    }

    public void setWrap(boolean wrap) {
        this.wrap = wrap;
    }
}
