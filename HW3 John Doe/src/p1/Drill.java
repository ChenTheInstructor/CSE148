package p1;

public class Drill extends Tool {
	private double voltage;
	private String sku;

	public Drill() {
		super();
		sku = "drill-" + super.getSku();
	}

	public Drill(String name, double price, boolean batteryIncluded, double voltage) {
		super(name, price, batteryIncluded);
		this.voltage = voltage;
		sku = "drill-" + super.getSku();
	}

	public double getVoltage() {
		return voltage;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	public String getSku() {
		return sku;
	}

	@Override
	public String toString() {
		return "Drill [voltage=" + voltage + ", sku=" + sku + ", BatteryIncluded=" + isBatteryIncluded() + ", Name="
				+ getName() + ", Price=" + getPrice() + "]";
	}

}
