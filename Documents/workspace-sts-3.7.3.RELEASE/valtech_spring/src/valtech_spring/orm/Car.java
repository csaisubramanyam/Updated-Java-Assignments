package valtech_spring.orm;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
//@Table(name="mycars")
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE) //For oracle use sequence
	private int id;
	private String make;
	private String model;
	private int yearManufactured;
	private float price;
	private String color;
	@Version
	private int version;
	@Embedded
	private CarDetails cardetails;
	
	public Car(){}
	public Car(int id, String make, String model, int yearManufactured, float price, String color,
			CarDetails cardetails) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.yearManufactured = yearManufactured;
		this.price = price;
		this.color = color;
		this.version = version;
		this.cardetails = cardetails;
	}
	public Car( String make, String model, int yearManufactured, float price, String color,
			CarDetails cardetails) {
		super();
		this.make = make;
		this.model = model;
		this.yearManufactured = yearManufactured;
		this.price = price;
		this.color = color;
		this.version = version;
		this.cardetails = cardetails;
	}
	
    
	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", yearManufactured=" + yearManufactured
				+ ", price=" + price + ", color=" + color + ", version=" + version + ", cardetails=" + cardetails + "]";
	}
	public void setCarDetails(CarDetails carDetails) {
		this.cardetails = carDetails;
	}
	
	public CarDetails getCardetails() {
		return cardetails;
	}
	
	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}

	
	public void setCardetails(CarDetails cardetails) {
		this.cardetails = cardetails;
	}


	public Car(int id, String make, String model, int yearManufactured, float price, String color) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.yearManufactured = yearManufactured;
		this.price = price;
		this.color = color;
	}
	
	
	public Car(String make, String model, int yearManufactured, float price, String color) {
		super();
		this.make = make;
		this.model = model;
		this.yearManufactured = yearManufactured;
		this.price = price;
		this.color = color;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearManufactured() {
		return yearManufactured;
	}
	public void setYearManufactured(int yearManufactured) {
		this.yearManufactured = yearManufactured;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
