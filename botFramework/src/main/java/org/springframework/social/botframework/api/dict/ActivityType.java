package org.springframework.social.botframework.api.dict;

/**
 * @author Anton Leliuk
 */
public enum ActivityType implements DictType {

    unknown("unknown"),
    text_message("message/text"),
    message("message"),
    attachment("message/image"),
    contactRelationUpdate("contactRelationUpdate"),
    conversationUpdate("conversationUpdate"),
    typing("typing"),
    ping("ping"),
    deleteUserData("activity/deleteUserData"),
    card("message/card.carousel");

    private String type;

    ActivityType(String type) {
        this.type = type;
    }

    public static ActivityType getInstance(String key){
        for (ActivityType type : values()) {
            if(type.getType().equals(key)){
                return type;
            }
        }
        return unknown;
    }

    public String getType() {
        return type;
    }

}
