package com.valtech.Tx.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("atmTx")
public class AtmTx extends Tx{
	
	private int AtmNo;
	private String location;
	
	
	public AtmTx() {}
	
	
	public AtmTx(int atmNo, String location) {
		super();
		AtmNo = atmNo;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "AtmTx [AtmNo=" + AtmNo + ", location=" + location + "]";
	}


	public int getAtmNo() {
		return AtmNo;
	}
	public void setAtmNo(int atmNo) {
		AtmNo = atmNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
