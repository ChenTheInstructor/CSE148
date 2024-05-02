package model;

public class StringBag {
	private String[] arr;
	private static int nElems;
	private static StringBag instance;
	
	private StringBag(int maxSize) {
		arr = new String[maxSize];
	}
	
	public static StringBag getInstance(int maxSize) {
		if(instance == null) {
			instance = new StringBag(maxSize);
		}
		return instance;
	}
	
	public static StringBag getInstance() {
		if(instance == null) {
			instance = new StringBag(10000);
		}
		return instance;
	}
	
	public void insert(String str) {
		arr[nElems++] = str;
	}

	public String get(int index) {
		return arr[index];
	}

	public static int getNElems() {
		return nElems;
	}
}
