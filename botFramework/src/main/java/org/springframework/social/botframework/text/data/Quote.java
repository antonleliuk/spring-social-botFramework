package org.springframework.social.botframework.text.data;

/**
 * @author Anton Leliuk
 */
public class Quote extends Text {

    private String recipientId;
    private String recipientName;
    private String conversationId;
    private String guid;
    private long timestamp;

    public Quote(String text, String recipientId, String recipientName, String conversationId, String guid, long timestamp) {
        super(text);
        this.recipientId = recipientId;
        this.recipientName = recipientName;
        this.conversationId = conversationId;
        this.guid = guid;
        this.timestamp = timestamp;
    }

//    <quote author=\"LOGIN\" authorname=\"LOGIN\" conversation=\"ID\" guid=\"xdedd1401e88ff300ec7303 6b9661085b15c683021741a32a042178c230debd97\" timestamp=\"1475750831\"><legacyquote>[13:47:11] LOGIN: </legacyquote>на их исправление много времени уйдет?<legacyquote>\r\n\r\n&lt;&lt;&lt; </legacyquote></quote>"

    @Override
    public String toText() {
        return new StringBuilder(Wrap.START_TAG).append("quote")
                .append("author").append(Wrap.EQUAL_SIGN).append(Wrap.QUOTE).append(recipientId).append(Wrap.QUOTE).append(Wrap.WHITESPACE)
                .append("authorname").append(Wrap.EQUAL_SIGN).append(Wrap.QUOTE).append(recipientName).append(Wrap.QUOTE).append(Wrap.WHITESPACE)
                .toString();
    }
}
