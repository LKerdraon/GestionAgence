package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.Destination;
import com.inti.repositories.IDestinationRespository;
import com.inti.services.interfaces.IDestinationService;

public class DestinationService implements IDestinationService{

	@Autowired 
	IDestinationRespository destinationRespository;
	
	@Override
	public List<Destination> findAll() {
		return destinationRespository.findAll();
	}

	@Override
	public Destination findOne(Long id) {
		return destinationRespository.findById(id).get();
	}

	@Override
	public Destination save(Destination destination) {
		return destinationRespository.save(destination);
	}

	@Override
	public void delete(Long id) {
		destinationRespository.deleteById(id);
		
	}

}
