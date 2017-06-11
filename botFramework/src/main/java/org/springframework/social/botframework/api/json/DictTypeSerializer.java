package org.springframework.social.botframework.api.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.social.botframework.api.dict.DictType;

import java.io.IOException;

/**
 * @author Anton Leliuk
 */
public class DictTypeSerializer extends JsonSerializer<DictType> {

    @Override
    public void serialize(DictType value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.getType());
    }
}
