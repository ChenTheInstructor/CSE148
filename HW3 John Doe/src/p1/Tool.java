package p1;

public abstract class Tool extends Merchandize {
	private boolean batteryIncluded;
	private String sku;

	public Tool() {
		this.sku = "tool-" + super.getSku();
	}
	
	public Tool(boolean batteryIncluded) {
		super();
		this.batteryIncluded = batteryIncluded;
		this.sku = "tool-" + super.getSku();
	}
	
	public Tool(String name, double price, boolean batteryIncluded) {
		super(name, price);
		this.batteryIncluded = batteryIncluded;
		this.sku = "tool-" + super.getSku();
	}

	public boolean isBatteryIncluded() {
		return batteryIncluded;
	}

	public void setBatteryIncluded(boolean batteryIncluded) {
		this.batteryIncluded = batteryIncluded;
	}

	public String getSku() {
		return sku;
	}

	@Override
	public String toString() {
		return "Tool [Name=" + getName() + ", Price()=" + getPrice() + ", sku=" + sku + ", batteryIncluded="
				+ batteryIncluded + "]";
	}
	
	
	
}
