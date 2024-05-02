package p1;

public record Student(String name, String id) {
	public String getBoth() {
		return name + ", " + id;
	}
}
