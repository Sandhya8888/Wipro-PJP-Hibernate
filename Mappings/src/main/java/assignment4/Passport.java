package assignment4;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Passport")
public class Passport {
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name="id")
	int id;
	@Column(name="pid")
	int pid;
	@Column(name="placeIssue")
	String placeIssue;
	@OneToOne(cascade = CascadeType.ALL)
	//@OneToOne
	 @JoinColumn(name = "id")
	private Employee e;
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPlaceIssue() {
		return placeIssue;
	}
	public void setPlaceIssue(String placeIssue) {
		this.placeIssue = placeIssue;
	}
	/*public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}*/


}
