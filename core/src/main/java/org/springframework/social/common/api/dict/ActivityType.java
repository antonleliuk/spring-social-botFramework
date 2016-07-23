package org.springframework.social.common.api.dict;

/**
 * @author Anton Leliuk
 */
public enum ActivityType {

    unknown("unknown"),
//    error,
//    personalMessage,
//    groupMessage,
    message("message/text"),
//    threadBotAdded,
//    threadBotRemoved,
//    threadAddMember,
//    threadRemoveMember,
//    threadTopicUpdated,
//    threadHistoryDisclosedUpdate,
//    contactAdded,
//    contactRemoved,
    attachment("message/image"),
    contactRelationUpdate("activity/contactRelationUpdate"),
    conversationUpdate("activity/conversationUpdate"),
    typing("activity/typing"),
    ping("activity/ping"),
    deleteUserData("activity/deleteUserData");

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
        return unknown;
    }

    public String getRealType() {
        return realType;
    }
}
