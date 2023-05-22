package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Hotel;

public interface IHotelService {
	List<Hotel> findAll();

	Hotel findOne(Long id);

	Hotel save(Hotel hotel);

	void delete(Long id);
}
