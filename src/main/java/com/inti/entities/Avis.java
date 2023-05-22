package com.inti.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AVIS", schema = "gestion_agence_db")
public class Avis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvis;
	
	private String commentaire;
	
	@ManyToOne
	private Hotel hotel;

	public Avis() {
	}

	public Avis(String commentaire, Hotel hotel) {
		super();
		this.commentaire = commentaire;
		this.hotel = hotel;
	}

	public Long getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", commentaire=" + commentaire + ", hotel=" + hotel + "]";
	}

	
}
