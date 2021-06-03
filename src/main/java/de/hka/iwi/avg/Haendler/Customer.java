package de.hka.iwi.avg.Haendler;

import spinjar.com.fasterxml.jackson.annotation.JsonIgnore;

public class Customer {
	@JsonIgnore
	public int id;
	public String surname;
	public String prename;
	public String birthDate;
	public int creditRating;
	public int purchaseVolume;
	
	public Customer(
			int id,
			String surname,
			String prename, 
			String birthDate, 
			int creditRating,
			int purchaseVolume
			) {
		this.id = id;
		this.surname = surname;
		this.prename = prename;
		this.birthDate = birthDate;
		this.creditRating = creditRating;
		this.purchaseVolume = purchaseVolume;
	}
	
	public Customer()
	{
		this.id = 99;
		this.surname = "";
		this.prename = "";
		this.birthDate = null;
		this.creditRating = 0;
		this.purchaseVolume = 0;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", prename=" + prename + ", birthDate=" + birthDate
				+ ", creditRating=" + creditRating + ", purchaseVolume=" + purchaseVolume + "]";
	}
}
