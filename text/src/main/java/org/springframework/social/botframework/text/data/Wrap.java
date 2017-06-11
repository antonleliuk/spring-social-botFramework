package org.springframework.social.botframework.text.data;

import org.springframework.social.botframework.text.dict.WrapType;

/**
 * @author Anton Leliuk
 */
public class Wrap implements TextPart {

    public static final String QUOTE = "\"";
    private static final String RAW_PRE = " raw_pre=";
    public static final String START_TAG = "<";
    private static final String RAW_POST = " raw_post=";
    public static final String BACK_SLASH = "/";
    public static final String END_TAG = ">";
    public static final String EQUAL_SIGN = "=";
    public static final String WHITESPACE = " ";

    private WrapType type;
    private TextPart text;

    private Wrap(WrapType type, TextPart text) {
        this.type = type;
        this.text = text;
    }

    public static Wrap bold(TextPart text){
        return new Wrap(WrapType.BOLD, text);
    }

    public static Wrap italic(TextPart text){
        return new Wrap(WrapType.ITALIC, text);
    }

    public static Wrap strikethrough(TextPart text){
        return new Wrap(WrapType.STRIKETHROUGH, text);
    }

    @Override
    public String toText() {
        return new StringBuilder(START_TAG)
                .append(type.getTag())
                .append(RAW_PRE)
                .append(QUOTE)
                .append(type.getSign())
                .append(QUOTE)
                .append(RAW_POST)
                .append(QUOTE)
                .append(type.getSign())
                .append(QUOTE)
                .append(END_TAG)
                .append(text.toText())
                .append(START_TAG).append(BACK_SLASH).append(type.getTag()).append(END_TAG)
                .toString();
    }
}
