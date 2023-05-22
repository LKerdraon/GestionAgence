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
private Long idVoyageur;
	@Column(name="date_reservation")
private Date dateReservation;
	@Column(name="nb_Jours")
private int nbJours;
	@ManyToOne 
	@JoinColumn(name="id_hotel")
	private Hotel hotel;
	@ManyToOne 
	@JoinColumn(name="id_voyageur")
	private Voyageur voyageur;
public Reservation() {
}
public Reservation(Date dateReservation, int nbJours) {
	this.dateReservation = dateReservation;
	this.nbJours = nbJours;
}
public Long getIdVoyageur() {
	return idVoyageur;
}
public void setIdVoyageur(Long idVoyageur) {
	this.idVoyageur = idVoyageur;
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
@Override
public String toString() {
	return "Reservation [idVoyageur=" + idVoyageur + ", nbJours=" + nbJours + "]";
}

}
