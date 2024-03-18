package p4_settings;

public enum Settings {
	MAX_PERSONS(100), MAX_BOOKS(10000);

	private int maxSize;

	Settings(int maxSize) {
		this.maxSize = maxSize;
	}

	public int getMaxSize() {
		return maxSize;
	}
	
	
}
