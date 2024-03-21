package p2_custom_Exceptions;

public class Student {
	private String name;
	private double score;

	public Student(String name, double score) {
		super();
		this.name = name;
		if (score < 0.0 || score > 100.0) {
			try {
				throw new IllegalScoreException("The score is illegal.");
			} catch (Exception ex) {
				ex.printStackTrace();
				System.out.println(ex.getMessage());
			}
		} else {
			this.score = score;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

}
