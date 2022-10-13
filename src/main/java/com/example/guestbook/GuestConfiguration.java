package com.example.guestbook;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GuestConfiguration {
    @Bean
    public ApplicationRunner databaseInitialization(GuestRepository guestRepository) {
        return args -> guestRepository.save(new Guest(
                "Roger Federer",
                "Basel",
                "I am the best tennis player"
        ));
    }
}
