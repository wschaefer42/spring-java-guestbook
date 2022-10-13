package com.example.guestbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuestService {
    private final GuestRepository guestRepository;

    // See why: https://blog.marcnuri.com/field-injection-is-not-recommended
    @Autowired
    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public List<Guest> getAll() {
        List<Guest> guests = new ArrayList<>();
        guestRepository.findAll().forEach(guests::add);
        return guests;
    }

    public Guest findById(Long id) {
        return guestRepository.findById(id).orElseThrow();
    }

}
