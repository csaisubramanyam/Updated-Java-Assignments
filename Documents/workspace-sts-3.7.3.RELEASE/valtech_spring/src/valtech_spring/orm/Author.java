package valtech_spring.orm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private int phone;
	@ManyToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},mappedBy="author")
	private Set<Book> book;
	@OneToOne(targetEntity=Author_Address.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	private Author_Address address;
	
	public Author() {}
	public Author(int id, String name, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public Author(String name, int phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", phone=" + phone + ", book=" + book + ", address=" + address
				+ "]";
	}
	
}
