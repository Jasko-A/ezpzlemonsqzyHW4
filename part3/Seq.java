// the Seq base class

public abstract class Seq {
	//abtract funtion for upperBound b/c each class that extends Seq will have 
	public abstract int upperBound();
	public static int getCount() {
		return (For.getCount() + Fib.getCount());
	}
}


