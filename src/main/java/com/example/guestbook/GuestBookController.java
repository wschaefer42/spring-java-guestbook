package com.example.guestbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/guestbook")
public class GuestBookController {
    private final GuestService guestService;

    @Autowired
    public GuestBookController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("guests", guestService.getAll());
        return "guestbook";
    }


    @GetMapping("/{id}")
    public String read(Model model, @PathVariable Long id) {
        var guest = guestService.findById(id);
        model.addAttribute("guest", guest);
        model.addAttribute("guests", guestService.getAll());
        return "guestbook";
    }

    @GetMapping("/ajax")
    public String ajax(Model model) {
        model.addAttribute("guests", guestService.getAll());
        return "guestbookAjax";
    }

    @GetMapping("/guest")
    public String guest(Model model, @RequestParam String id) {
        var guest = guestService.findById(Long.parseLong(id));
        model.addAttribute("guest", guest);
        return "guest";
    }
}
