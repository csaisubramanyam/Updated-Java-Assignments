package valtech_spring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ctx")
public class ChequeTx extends Tx {
	
	private int chequeNo;
	private boolean outstation;
	private float collectioncharges;
	
	
	public ChequeTx() {}
	public ChequeTx(float amount, int chequeNo, boolean outstation, float collectioncharges) {
		super();
		this.chequeNo = chequeNo;
		this.outstation = outstation;
		this.collectioncharges = collectioncharges;
	}
	public int getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}
	public boolean isOutstation() {
		return outstation;
	}
	public void setOutstation(boolean outstation) {
		this.outstation = outstation;
	}
	public float getCollectioncharges() {
		return collectioncharges;
	}
	public void setCollectioncharges(float collectioncharges) {
		this.collectioncharges = collectioncharges;
	}
	
}
