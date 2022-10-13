package com.example.guestbook;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Guest {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length = 100, nullable = false)
    String name;
    @Column(length = 100, nullable = false)
    String city;
    @Column(length = 250)
    String message;

    public Guest(String name, String city, String message) {
        this.name = name;
        this.city = city;
        this.message = message;
    }

    public Guest() {
    }
}
