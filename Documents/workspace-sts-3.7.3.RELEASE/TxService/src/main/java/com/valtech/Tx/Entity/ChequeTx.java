package com.valtech.Tx.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("chequeTx")
public class ChequeTx extends Tx{
	
	private int ChequeNo;
	private boolean Outstation;
	private float CollectionCharges;
	
	
	public ChequeTx() {}
	
	
	public ChequeTx(int chequeNo, boolean outstation, float collectionCharges) {
		super();
		ChequeNo = chequeNo;
		Outstation = outstation;
		CollectionCharges = collectionCharges;
	}
	
	
	@Override
	public String toString() {
		return "ChequeTx [ChequeNo=" + ChequeNo + ", Outstation=" + Outstation + ", CollectionCharges="
				+ CollectionCharges + "]";
	}


	public int getChequeNo() {
		return ChequeNo;
	}
	public void setChequeNo(int chequeNo) {
		ChequeNo = chequeNo;
	}
	public boolean isOutstation() {
		return Outstation;
	}
	public void setOutstation(boolean outstation) {
		Outstation = outstation;
	}
	public float getCollectionCharges() {
		return CollectionCharges;
	}
	public void setCollectionCharges(float collectionCharges) {
		CollectionCharges = collectionCharges;
	}
	
	
	
	
}
