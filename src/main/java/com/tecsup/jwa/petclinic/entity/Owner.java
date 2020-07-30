package com.tecsup.jwa.petclinic.entity;

import java.util.Date;

public class Owner {

	String first_name;
	String last_name;
	String adress;
	String city;
	String telephone;
	Date create;
	boolean enabled;

	
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Owner(String first_name, String last_name, String adress, String city, String telephone, Date create,
			boolean enabled) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.adress = adress;
		this.city = city;
		this.telephone = telephone;
		this.create = create;
		this.enabled = enabled;
	}

	public Owner(String first_name, String last_name, String adress, String city, String telephone, Date create) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.adress = adress;
		this.city = city;
		this.telephone = telephone;
		this.create = create;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Owner [first_name=" + first_name + ", last_name=" + last_name + ", adress=" + adress + ", city=" + city
				+ ", telephone=" + telephone + ", create=" + create + ", enabled=" + enabled + "]";
	}







}
