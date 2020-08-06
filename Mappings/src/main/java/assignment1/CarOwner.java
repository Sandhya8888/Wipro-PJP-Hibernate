package assignment1;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CAR_OWNER")
public class CarOwner {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	int id;
	@Column(name="OwnerId")
	private int OwnerId;
	@Column(name="OwnerName")
	private String OwnerName;
	@OneToOne(cascade = CascadeType.ALL,targetEntity=CarDetail.class)
	private CarDetail car;
	@Override
	public String toString() {
		return "CarOwner [OwnerId=" + OwnerId + ", OwnerName=" + OwnerName + ", car=" + car + "]";
	}
	public int getOwnerId() {
		return OwnerId;
	}
	public void setOwnerId(int ownerId) {
		OwnerId = ownerId;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	public CarDetail getCar() {
		return car;
	}
	public void setCar(CarDetail car) {
		this.car = car;
	}

}
