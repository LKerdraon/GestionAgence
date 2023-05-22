package com.inti.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVATION", schema = "gestion_agence_db")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	
	@Column(name = "date_reservation")
	private Date dateReservation;
	
	@Column(name = "nb_Jours")
	private int nbJours;
	
	@ManyToOne
	@JoinColumn(name = "id_hotel")
	private Hotel hotel;
	
	@ManyToOne
	@JoinColumn(name = "id_voyageur")
	private Voyageur voyageur;


	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Voyageur getVoyageur() {
		return voyageur;
	}

	public void setVoyageur(Voyageur voyageur) {
		this.voyageur = voyageur;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	public Reservation() {
	}
	
	public Reservation(Long idReservation, Date dateReservation, int nbJours, Hotel hotel, Voyageur voyageur) {
		this.idReservation = idReservation;
		this.dateReservation = dateReservation;
		this.nbJours = nbJours;
		this.hotel = hotel;
		this.voyageur = voyageur;
	}

	

}
