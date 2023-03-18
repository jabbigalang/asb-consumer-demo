package com.chrisen.consumer.messaging;

import com.chrisen.consumer.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class ConsumerDemo {

    @Bean
    public Consumer<User> getUser() {
        return message -> {
            log.info("Hello, " + message.getName() + "!");
        };
    }

}
