package ar.edu.unju.fi.exceptions;

public class CustomException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public CustomException(String mensaje) {
		super(mensaje);
	}
}
