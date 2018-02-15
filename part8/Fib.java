public class Fib extends Seq {

	protected int first1;
	protected int first2;
	protected int last;
	private static int countFib = 0;
	//constructor for FIb Class
	Fib(int first1, int first2, int last) {
		this.first1 = first1;
		this.first2 = first2;
		this.last = last;
		countFib++;
	}
	//this method turns numbers into string and returns a string of correct output
	public String toString() {
		String newString = "< " + first1 + ", " + first2 + " to " + last + " >";
		return newString;
	}
	//method to overwrite upperBound function in Seq abstract class to suit the needs of the Fib class.
	public int upperBound() {
		return last;
	}
	//method to get the count for which a Fib object is being created
	public static int getCount() {
		return countFib;
	}

	public SeqIt createSeqIt() {
		FibIt iterator = new FibIt(this);
		return iterator;
	}

}