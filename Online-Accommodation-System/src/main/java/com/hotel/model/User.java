package com.hotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String uid;
	@NotNull
	private String fname;
	@NotNull
	private String lname;
	@NotNull
	@Pattern(regexp = ".+@.+\\..+", message = "Wrong email!")
	private String email;
	@NotNull
	private String password;
	@NotNull
	private int phone_no;
	@NotNull
	private String Gender;
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate Date;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

}
