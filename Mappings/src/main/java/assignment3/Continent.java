package assignment3;

import java.util.Map;
public class Continent {
	private int id;
	public Continent(String cname,Map<String, String> countries) {
		this.cname=cname;
		this.countries=countries;
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String cname;
	private Map<String,String> countries;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Map<String, String> getCountries() {
		return countries;
	}
	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}
}
