package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="VOYAGEURS", schema = "gestion_agence_db")
public class Voyageur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoyageur;
	
	private String nom;
	
	private int age;
	
	@OneToMany(mappedBy = "voyageur")
	private List<Reservation> reservations= new ArrayList<>();

	public Long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Voyageur() {
	}

	public Voyageur(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Voyageur [idVoyageur=" + idVoyageur 
				+ ", nom=" + nom 
				+ ", age=" + age 
				//+ ", reservations=" + reservations
				+ "]";
	}


	
	
	
}
