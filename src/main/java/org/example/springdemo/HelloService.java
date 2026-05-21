package org.example.springdemo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
@Getter
@Setter
public class HelloService {

    private Map<String, Message> messages;

    public HelloService(Map<String, Message> messages) {
        this.messages = messages;
    }

    public HelloService() {
        this.messages = new HashMap<>(Map.of(
                UUID.randomUUID().toString(),
                new Message(UUID.randomUUID().toString(), "Message one", "Lorem ipsum ..."),
                UUID.randomUUID().toString(),
                new Message(UUID.randomUUID().toString(), "Message two", "Lorem ipsum ...")
        ));
    }
}
