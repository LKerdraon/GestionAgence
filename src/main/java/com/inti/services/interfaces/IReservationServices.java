package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Reservation;


public interface IReservationServices {
	List<Reservation> findAll();

	Reservation findOne(Long id);

	Reservation save(Reservation reservation);

	void delete(Long id);
}
