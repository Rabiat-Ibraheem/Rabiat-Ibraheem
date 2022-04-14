package dev.ibraheem.SPMSExceptions;

public class usernameAlreadyExistsException extends Exception {
	public usernameAlreadyExistsException () {
		super("The requested username is taken. Please enter a different username.");
	}
}
