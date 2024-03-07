package exam1;

public class MusicCD extends Item {
	private String artist;
	private String genre;

	public MusicCD(String title, String publisher, String artist, String genre) {
		super(title, publisher);
		this.artist = artist;
		this.genre = genre;
	}

	public MusicCD(String title, String publisher) {
		super(title, publisher);
	}

	public MusicCD() {
		super();
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "MusicCD " + getTitle() + ", " + getPublisher() + ", " + getCallNumber() + ", " + artist + ", " + genre
				+ "]";
	}

}
