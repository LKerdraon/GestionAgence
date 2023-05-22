package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Destination;

@Repository
public interface IDestinationRespository extends JpaRepository<Destination, Long>{

}
