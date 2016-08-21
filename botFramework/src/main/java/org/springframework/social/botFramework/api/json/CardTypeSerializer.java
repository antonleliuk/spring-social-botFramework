package org.springframework.social.botFramework.api.json;

import java.io.IOException;

import org.springframework.social.botFramework.api.dict.CardType;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @author Anton Leliuk
 */
public class CardTypeSerializer extends JsonSerializer<CardType> {

    @Override
    public void serialize(CardType value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        gen.writeString(value.getType());
    }
}
