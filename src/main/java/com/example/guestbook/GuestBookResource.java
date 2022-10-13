package com.example.guestbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/guestbook")
public class GuestBookResource {
    private GuestService guestService;

    // See why: https://blog.marcnuri.com/field-injection-is-not-recommended
    @Autowired
    public GuestBookResource(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping("/guests")
    public List<Guest> findAll() {
        return guestService.getAll();
    }
}
