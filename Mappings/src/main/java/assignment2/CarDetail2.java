package assignment2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAR_DETAILS")
public class CarDetail2 {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	int id;
	String regno;
	String model;
	String color;
	String Manufacturer;
	@Override
	public String toString() {
		return "CarDetail [id=" + id + ", regno=" + regno + ", model=" + model + ", color=" + color + ", Manufacturer="
				+ Manufacturer + "]";
	}
	public CarDetail2() {
		
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
