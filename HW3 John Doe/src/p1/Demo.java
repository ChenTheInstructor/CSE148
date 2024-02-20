package p1;

public class Demo {

	public static void main(String[] args) {
		Drill d1 = new Drill("Makita", 99.99, true, 12);
		Drill d2 = new Drill("Milwaukee", 119.99, true, 12);
		Drill d3 = new Drill("Craftsmam", 95.99, false, 6);
		
		MerchandizeBag bag = new MerchandizeBag(10);
		bag.insert(d1);
		bag.insert(d2);
		bag.insert(d3);
		
//		bag.display();
//		System.out.println(bag.searchBySku("drill-tool-5"));
//		bag.display("tool");
		System.out.println(bag.removeBySku("drill-tool-3"));
		System.out.println("The bag content after removal: ");
		bag.display();
		
	}

}
