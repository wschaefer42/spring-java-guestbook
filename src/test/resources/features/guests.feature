Feature: GuestBook
  Scenario: Albert arrives
    Given Albert Einstein has arrived
    When the GuestBook register him
    Then Albert is registered in our book