package com.rasbus.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;

@Entity
@Table(name="paradero")
public class Paradero implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idParadero;
	
	@Column(name="latitud",columnDefinition="Decimal(2,9)",nullable=false)
	private double latitud;
	
	@Column(name="longitud",columnDefinition="Decimal(2,9)",nullable=false)
	private double longitud;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="dregistro")
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	
	@ManyToOne
	@JoinColumn(name="idDistrito",nullable=false)
	private Distrito distrito;
}
