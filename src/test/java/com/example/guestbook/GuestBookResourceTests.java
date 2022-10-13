package com.example.guestbook;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class GuestBookResourceTests {
    @MockBean
    private GuestService guestService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getGuestByAll() throws Exception {
        when(guestService.getAll()).thenReturn(List.of(
                new Guest(
                        "Donald Duck",
                        "Entenhausen",
                        "I am the biggest loser"
                )));
        mockMvc.perform(get("/guestbook/guests").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.[0].name").value("Donald Duck"));
    }
}
