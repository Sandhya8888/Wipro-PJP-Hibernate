package assignment4;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name="id")
    int id; 
	@Column(name="name")
	private String name;
	@Column(name="role")
	private String role;
	@Column(name="salary")
	private int salary;
	@OneToOne(cascade=CascadeType.ALL,targetEntity=Passport.class,orphanRemoval = true)
	private Passport p;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Passport getP() {
		return p;
	}
	public void setP(Passport p) {
		this.p = p;
	}
	

}
