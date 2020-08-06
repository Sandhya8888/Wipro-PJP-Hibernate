package assignment3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="CAR_DETAILS")
public class Car3 {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	int id;
	@Column(name="Regno")
	String regno;
	@Column(name="Model")
	String model;
	@Column(name="Color")
	String color;
	@Column(name="Manufacturer")
	String Manufacturer;
	public Car3() {
		
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return "Car3 [id=" + id + ", regno=" + regno + ", model=" + model + ", color=" + color + ", Manufacturer="
				+ Manufacturer + "]";
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	
	
}
