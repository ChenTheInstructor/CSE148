package p1;

public class MerchandizeBag {
	private Merchandize[] bag;
	private int nElems;

	public MerchandizeBag(int maxSize) {
		bag = new Merchandize[maxSize];
	}
	
	public int size() {
		return nElems;
	}
	
	public Merchandize removeBySku(String sku) {
		int i;
		for(i = 0; i < nElems; i++) {
			if(bag[i].getSku().equals(sku)) {
				break;
			}
		}
		
		if(i == nElems) {
			return null;
		} else {
			Merchandize temp = bag[i];
			for(int j = i; j < nElems - 1; j++) {
				bag[j] = bag[j + 1];
			}
			nElems--;
			return temp;
		}
	}
	
	public Merchandize searchBySku(String sku) {
		for(int i = 0; i < nElems; i++) {
			if(bag[i].getSku().equals(sku)) {
				return bag[i];
			}
		}
		return null;
	}

	public void insert(Merchandize product) {
		bag[nElems++] = product;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(bag[i]);
		}
	}

	public void display(String category) {
		for (int i = 0; i < nElems; i++) {
			if (bag[i].getSku().contains(category)) {
				System.out.println(bag[i]);
			}
		}
	}
}
