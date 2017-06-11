package org.springframework.social.botframework.api.data.cards;

/**
 * Defines a key-value pair that contains a fact.
 * @author Anton Leliuk
 */
public class Fact {

    /**
     * Name of the fact. For example, Check-in. The key is used as a label when displaying the fact's value.
     */
    private String key;

    /**
     * Value of the fact. For example, <b>10 October 2016.</b>
     */
    private String value;

    public Fact key(String key){
        this.key = key;
        return this;
    }

    public Fact value(String value){
        this.value = value;
        return this;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
