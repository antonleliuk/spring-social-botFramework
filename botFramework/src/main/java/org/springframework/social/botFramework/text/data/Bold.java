package org.springframework.social.botFramework.text.data;

/**
 * @author Anton Leliuk
 */
public class Bold extends Wrap implements TextPart {

    Bold(String text) {
        super(text, "b", "*");
    }

    public static Bold text(String text){
        return new Bold(text);
    }

}
