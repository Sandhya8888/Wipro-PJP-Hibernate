package assignment2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="CAR_OWNER")
public class MultiCarOwner {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int OwnerId;
	private String OwnerName;
	@OneToMany(targetEntity=CarDetail2.class,cascade=CascadeType.ALL)
	@JoinColumn(name="OId")
	private List<CarDetail2> cars;
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
	public List<CarDetail2> getCars() {
		return cars;
	}
	public void setCars(List<CarDetail2> cars) {
		this.cars = cars;
	}

}
