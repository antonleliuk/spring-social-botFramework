package org.springframework.social.botFramework.api.json;

import java.io.IOException;

import org.springframework.social.common.api.dict.ActivityType;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @author Anton Leliuk
 */
public class ActivityTypeSerializer extends JsonSerializer<ActivityType> {

    @Override
    public void serialize(ActivityType value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.getRealType());
    }
}
