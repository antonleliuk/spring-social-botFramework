package org.springframework.social.botFramework.text.dict;

/**
 * @author Anton Leliuk
 */
public enum WrapType {

    BOLD("b", "*"),
    ITALIC("i", "_"),
    STRIKETHROUGH("s", "~");

    private String tag;
    private String sign;

    private WrapType(String tag, String sign) {
        this.tag = tag;
        this.sign = sign;
    }

    public String getTag() {
        return tag;
    }

    public String getSign() {
        return sign;
    }
}
