package com.example.Reto3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Reto3.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
