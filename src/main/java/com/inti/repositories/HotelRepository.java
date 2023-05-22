package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
