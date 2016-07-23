package org.springframework.social.botFramework.api.json;

import java.io.IOException;

import org.springframework.social.common.api.dict.ActivityType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * @author Anton Leliuk
 */
public class ActivityTypeDeserializer extends JsonDeserializer<ActivityType> {

    @Override
    public ActivityType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return ActivityType.getInstance(p.getText());
    }
}
