package org.springframework.social.botFramework.text.data;

/**
 * @author Anton Leliuk
 */
public class Strike extends Wrap implements TextPart {

    Strike(String text) {
        super(text, "s", "~");
    }

    public static Strike text(String text){
        return new Strike(text);
    }
}
