package org.springframework.social.botFramework.text.data;

/**
 * @author Anton Leliuk
 */
public class Italic extends Wrap implements TextPart {

    Italic(String text) {
        super(text, "i", "_");
    }

    public static Italic text(String text){
        return new Italic(text);
    }
}
