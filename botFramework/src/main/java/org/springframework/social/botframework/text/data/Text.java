package org.springframework.social.botframework.text.data;

/**
 * @author Anton Leliuk
 */
public class Text implements TextPart {

    private String text;

    Text(String text){
        this.text = text;
    }

    public static Text text(String text){
        return new Text(text);
    }

    @Override
    public String toText() {
        return text;
    }
}
