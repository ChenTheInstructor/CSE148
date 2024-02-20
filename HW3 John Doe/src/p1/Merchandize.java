package p1;

public abstract class Merchandize {
	private String name;
	private double price;
	private String sku;

	private static int skuID = 1;

	public Merchandize() {
		sku = String.valueOf(skuID++);
	}

	public Merchandize(String name, double price) {
		this.name = name;
		this.price = price;
		sku = String.valueOf(skuID++);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSku() {
		return sku;
	}

	@Override
	public String toString() {
		return "Merchandize [name=" + name + ", price=" + price + ", sku=" + sku + "]";
	}

}
