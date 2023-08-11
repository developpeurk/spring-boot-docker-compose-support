package com.lambarki.hotelservice.web;

import com.lambarki.hotelservice.entities.Reservation;
import com.lambarki.hotelservice.repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {

    private ReservationRepository repository;

    @GetMapping("/reservations")
    public List<Reservation> reservationList() {
        return repository.findAll();
    }
}
