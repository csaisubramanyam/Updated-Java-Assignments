package valtech_spring.orm;

import javax.persistence.CascadeType; 
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
//@Inheritance(strategy=InheritanceType.JOINED)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="atxs")
@DiscriminatorColumn(name="disc")
@DiscriminatorValue("tx")
public class Tx {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private float amount;
    @ManyToOne(targetEntity=Account.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
    @JoinColumn(name="account_id",referencedColumnName="id")
    private Account account;
    public Tx(float amount) {
        super();
        this.amount = amount;
    }
    
    public Account getAccount() {
		return account;
	}
    
    public void setAccount(Account account) {
		this.account = account;
	}
    
    public Tx(){}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Tx [id=" + id + ", amount=" + amount + "]";
    }
    
}