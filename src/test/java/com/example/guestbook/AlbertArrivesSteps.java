package com.example.guestbook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class AlbertArrivesSteps {
    private Guest guest;

    @Autowired
    private GuestRepository guestRepository;

    @Given("Albert Einstein has arrived")
    public void albertEinsteinHasArrived() {
        guest = new Guest(
            "Albert Einstein",
            "Bern",
            "I am the famous scientist");
    }

    @When("the GuestBook register him")
    public void theGuestBookRegisterHim() {
        guestRepository.save(guest);
    }

    @Then("Albert is registered in our book")
    public void albertIsRegisteredInOurBook() {
        assert(guestRepository.findByName(guest.name) != null);
    }
}
