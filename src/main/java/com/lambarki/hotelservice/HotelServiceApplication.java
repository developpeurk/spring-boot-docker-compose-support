package com.lambarki.hotelservice;

import com.lambarki.hotelservice.entities.Reservation;
import com.lambarki.hotelservice.entities.ReservationStatus;
import com.lambarki.hotelservice.repositories.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HotelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner (ReservationRepository repository) {
        return args -> {
            repository.save(Reservation.builder().title("Res 1").price(1200).status(ReservationStatus.CREATED).build());
            repository.save(Reservation.builder().title("Res 2").price(2300).status(ReservationStatus.CONFIRMED).build());
            repository.save(Reservation.builder().title("Res 3").price(312).status(ReservationStatus.CANCELED).build());
        };
    }
}
