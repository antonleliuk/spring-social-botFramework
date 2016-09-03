package org.springframework.social.botFramework.text.data;

/**
 * @author Anton Leliuk
 */
public abstract class Wrap extends Text implements TextPart {

    private static final String QUOTE = "\"";
    private static final String RAW_PRE = " raw_pre=";
    private static final String START_TAG = "<";
    private static final String RAW_POST = " raw_post=";
    private static final String BACK_SLASH = "/";
    private static final String END_TAG = ">";

    private String start;
    private String end;


    Wrap(String text, String tagName, String sign) {
        super(text);
        this.start = new StringBuilder(START_TAG)
                .append(tagName)
                .append(RAW_PRE)
                .append(QUOTE)
                .append(sign)
                .append(QUOTE)
                .append(RAW_POST)
                .append(QUOTE)
                .append(sign)
                .append(QUOTE)
                .append(END_TAG)
                .toString();
        this.end = new StringBuilder(START_TAG).append(BACK_SLASH).append(tagName).append(END_TAG).toString();
    }

    @Override
    public String toText() {
        return new StringBuilder(start).append(super.toText()).append(end).toString();
    }
}
