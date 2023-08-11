package com.lambarki.hotelservice.repositories;

import com.lambarki.hotelservice.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
