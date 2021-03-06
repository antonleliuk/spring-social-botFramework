package org.springframework.social.botframework.api.data.cards.adaptive.data.elements;

/**
 * @author Anton Leliuk
 */
public abstract class InputCardElement<V, C extends CardElement> extends CardElement<InputCardElement<V, C>> {

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

    public C id(String id){
        this.id = id;
        return (C) this;
    }

    public C placeholder(String placeholder){
        this.placeholder = placeholder;
        return (C) this;
    }

    public C value(V value){
        this.value = value;
        return (C) this;
    }

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
