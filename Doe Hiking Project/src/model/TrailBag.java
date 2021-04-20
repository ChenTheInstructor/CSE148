package model;

public class TrailBag {
	private Trail[] arr;
	private int nElems;
	
	public TrailBag(int maxSize) {
		arr = new Trail[maxSize];
	}
	
	public void insert(Trail trail) {
		arr[nElems++] = trail;
	}

}
