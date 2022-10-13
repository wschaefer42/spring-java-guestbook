package com.example.guestbook;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
    @Query("select g from Guest g where g.name = ?1")
    Guest findByName(String name);
}
