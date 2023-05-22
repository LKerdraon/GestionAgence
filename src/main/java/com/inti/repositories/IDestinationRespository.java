package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Destination;

public interface IDestinationRespository extends JpaRepository<Destination, Long>{

}
