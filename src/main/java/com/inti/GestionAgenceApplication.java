package com.inti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inti.entities.Voyageur;
import com.inti.services.impl.VoyageurService;
import com.inti.services.interfaces.IVoyageurService;

@SpringBootApplication
public class GestionAgenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionAgenceApplication.class, args);
	}

	
}
