package p2_custom_Exceptions;

public class IllegalScoreException extends RuntimeException {
	public IllegalScoreException() {
		super();
	}

	public IllegalScoreException(String message) {
		super(message);
	}

}
