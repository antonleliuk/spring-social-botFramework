package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

/**
 * @author Anton Leliuk
 */
public class Fact {

    private String title;

    private String speak;

    private String value;

    public Fact title(String title){
        this.title = title;
        return this;
    }

    public Fact speak(String speak){
        this.speak = speak;
        return this;
    }

    public Fact value(String value){
        this.value = value;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
