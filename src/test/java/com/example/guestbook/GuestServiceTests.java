package com.example.guestbook;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GuestServiceTests {
    @Mock
    private GuestRepository guestRepository;

    @InjectMocks
    private GuestService guestService;

    @Test
    void getGuestByAll() {
        when(guestRepository.findAll()).thenReturn(List.of(
                new Guest(
                        "Donald Duck",
                        "Entenhausen",
                        "I am the biggest loser"
                )));
        assertEquals(1, guestService.getAll().size());
    }
}
