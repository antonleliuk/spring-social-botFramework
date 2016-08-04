package org.springframework.social.common.api.dict;

/**
 * @author Anton Leliuk
 */
public enum ActivityType {

    unknown("unknown"),
//    error,
//    personalMessage,
//    groupMessage,
    text_message("message/text"),
    message("message"),
//    threadBotAdded,
//    threadBotRemoved,
//    threadAddMember,
//    threadRemoveMember,
//    threadTopicUpdated,
//    threadHistoryDisclosedUpdate,
//    contactAdded,
//    contactRemoved,
    attachment("message/image"),
    contactRelationUpdate("contactRelationUpdate"),
    conversationUpdate("activity/conversationUpdate"),
    typing("activity/typing"),
    ping("ping"),
    deleteUserData("activity/deleteUserData"),
    card("message/card.carousel");

    private String realType;

    ActivityType(String realType) {
        this.realType = realType;
    }

    public static ActivityType getInstance(String key){
        for (ActivityType type : values()) {
            if(type.getRealType().equals(key)){
                return type;
            }
        }
        System.out.println("Unknown activity type - " + key);
        return unknown;
    }

    public String getRealType() {
        return realType;
    }

    public boolean isPing(){
        return this == ping;
    }
}
