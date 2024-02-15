package p1;

public class Address {
	private String number;
	private String name;
	private String city;
	private String state;
	private String zip;

	public Address() {
	}

	public Address(String number, String name, String city, String state, String zip) {
		this.number = number;
		this.name = name;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [number=" + number + ", name=" + name + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ "]";
	}

}
