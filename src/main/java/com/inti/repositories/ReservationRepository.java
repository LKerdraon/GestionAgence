package com.inti.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Reservation;

	@Repository
	public interface ReservationRepository extends JpaRepository<Reservation, Long> {
		// JpaRepsitory : CRUD : findAll, findById, create, update ...
		
		Reservation findByDateReservation(Date dateReservation);

		@Query(value = "select * from reservation r where r.nbJours = ?1 ")
		List<Reservation> findReservationByNbJours(int nbJours);

		@Query(value = "select * from reservation r where r.dateReservation = ?1 and u.nbJours = ?2")
		List<Reservation> findReservatioonByNbJoursAndDateReservation(int nbJours, Date dateReservation);
		
	
		@Query("select r from reservation r where r.dateReservation = ?1")
		List<Reservation> findReservationByDateReservation(String dateReservation);
}