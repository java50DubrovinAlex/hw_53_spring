package telran.cars.exceptions;

@SuppressWarnings("serial")
public class IlligalStateException extends RuntimeException {
	public IlligalStateException(String messeg) {
		super(messeg);
	}
}
