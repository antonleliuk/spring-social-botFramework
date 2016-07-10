package com.skype.controller;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.social.skypeBot.api.data.from.BaseMessage;
import org.springframework.social.skypeBot.api.data.from.Message;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.skype.SkypeApplication;

/**
 * @author Anton Leliuk
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SkypeApplication.class)
@WebIntegrationTest
public class EchoControllerTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void marshalling() throws IOException {
        List<BaseMessage> messages = new ArrayList<>();

        Message textMessage = new Message();
        textMessage.setId(UUID.randomUUID().toString());
        textMessage.setTime(Date.from(Instant.now()));
        textMessage.setFrom("anton.leliuk");
        textMessage.setTo("test@group");
        textMessage.setContent("Hello");

        messages.add(textMessage);

        String json = objectMapper.writeValueAsString(messages);
        System.out.println(json);

        List<BaseMessage> fromJsonMessages = objectMapper.readValue(json, TypeFactory.defaultInstance().constructCollectionType(List.class, BaseMessage.class));
        System.out.println(fromJsonMessages);
    }
}
