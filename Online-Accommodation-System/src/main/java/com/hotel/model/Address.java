package com.hotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String aid;
	@NotNull
	private String address1;
	@NotNull
	private String address2;
	@NotNull
	private String landmark;
	@NotNull
	private int zipcode;
	@NotNull
	private String city;
	@NotNull
	private String state;
	
}
