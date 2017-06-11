package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

/**
 * @author Anton Leliuk
 */
public abstract class InputCardElement<V> extends CardElement {

    /**
     * Id for the value (will be used to identify collected input when SUBMIT is clicked)
     */
    private String id;

    /**
     * Title Description of the input desired
     */
    private String placeholder;

    /**
     * The initial value for a field
     */
    private V value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
