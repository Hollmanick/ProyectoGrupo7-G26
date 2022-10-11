package com.example.Retos_3_4_5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Retos_3_4_5.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
