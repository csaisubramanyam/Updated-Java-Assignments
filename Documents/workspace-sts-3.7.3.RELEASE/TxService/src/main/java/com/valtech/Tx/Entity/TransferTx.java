package com.valtech.Tx.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("transferTx")
public class TransferTx extends Tx{
	
	private int FromAccount;
	private int ToAccount;
	
	
	public TransferTx() {}
	
	
	public TransferTx(int fromAccount, int toAccount) {
		super();
		FromAccount = fromAccount;
		ToAccount = toAccount;
	}
	
	
	@Override
	public String toString() {
		return "TransferTx [FromAccount=" + FromAccount + ", ToAccount=" + ToAccount + "]";
	}


	public int getFromAccount() {
		return FromAccount;
	}
	public void setFromAccount(int fromAccount) {
		FromAccount = fromAccount;
	}
	public int getToAccount() {
		return ToAccount;
	}
	public void setToAccount(int toAccount) {
		ToAccount = toAccount;
	}
	
	
	
	
}
