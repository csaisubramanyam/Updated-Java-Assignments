package valtech_spring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Hbook")
public class HardBook extends Book{
	
	private int isbn;
	private int price;
	private int PublishedYear;
	private int Edition;
	
	public HardBook() {}

	public HardBook(int isbn, int price, int publishedYear, int edition) {
		super();
		this.isbn = isbn;
		this.price = price;
		PublishedYear = publishedYear;
		Edition = edition;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPublishedYear() {
		return PublishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		PublishedYear = publishedYear;
	}

	public int getEdition() {
		return Edition;
	}

	public void setEdition(int edition) {
		Edition = edition;
	}

	@Override
	public String toString() {
		return "HardBook [isbn=" + isbn + ", price=" + price + ", PublishedYear=" + PublishedYear + ", Edition="
				+ Edition + ", getId()=" + getId() + ", getName()=" + getName() + ", getYearPublished()="
				+ getYearPublished() + "]";
	}
	
	
}
