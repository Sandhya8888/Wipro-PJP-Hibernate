package assignment1;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//@Parameter(value="employee", name = "property")
@Entity
@Table(name="CAR_DETAILS")
public class CarDetail {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	@OneToOne(targetEntity=CarOwner.class,cascade = CascadeType.ALL)
	private CarOwner co;
	public CarOwner getCo() {
		return co;
	}
	public void setCo(CarOwner co) {
		this.co = co;
	}
	@Override
	public String toString() {
		return "CarDetail [id=" + id + ", regno=" + regno + ", model=" + model + ", color=" + color + ", Manufacturer="
				+ Manufacturer + "]";
	}
	public CarDetail() {
		
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
