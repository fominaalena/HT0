package by.epam.training.ht0.util;

public class IlluminanceTooMuchException extends Exception{

	private String message;

	public IlluminanceTooMuchException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
