package com.example.guestbook;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@Import(GuestConfiguration.class)
public class GuestRepositoryTests {
    private final TestEntityManager entityManager;
    private final GuestRepository guestRepository;

    @Autowired
    public GuestRepositoryTests(TestEntityManager entityManager, GuestRepository guestRepository) {
        this.entityManager = entityManager;
        this.guestRepository = guestRepository;
    }

    @Test
    void addEntityAndFindAgain() {
        var guest = new Guest(
                "Steven Jobs",
                "San Francisco",
                "I am the founder of Apple");
        entityManager.persist(guest);
        entityManager.flush();
        var found = guestRepository.findById(guest.getId());
        assertTrue(found.isPresent() && found.get().equals(guest));
    }
}
