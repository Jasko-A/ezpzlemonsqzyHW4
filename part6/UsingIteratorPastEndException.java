public class UsingIteratorPastEndException extends Exception{
	static final long serialVersionUID = 98L; //just in case for error mentioned in the hw pdf
	
	UsingIteratorPastEndException() {}

	UsingIteratorPastEndException(String message) {
		super(message);
	}
}