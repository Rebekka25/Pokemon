package de.pokemon.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="USER")
public class User {

	@Id
	private String email;
	@NonNull
	private String password;
	/*private String user;
	private String lastname;
	private String fistname;
	private int telephonNumber;
	private int mobile;
	private String street;
	private int streetNumber;
	private String domicil;
	private int postCode;
	private Date birthday;*/
	/**
	 * 
	 */
//	private String titel;
	
/*	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFistname() {
		return fistname;
	}
	public void setFistname(String fistname) {
		this.fistname = fistname;
	}
	public int getTelephonNumber() {
		return telephonNumber;
	}
	public void setTelephonNumber(int telephonNumber) {
		this.telephonNumber = telephonNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}*/
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
/*	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getDomicil() {
		return domicil;
	}
	public void setDomicil(String domicil) {
		this.domicil = domicil;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	*/
}
