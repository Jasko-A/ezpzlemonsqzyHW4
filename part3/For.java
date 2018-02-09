public class For extends Seq{

	protected int first;
	protected int last;
	protected int step;
	private static int countFor;
	//constructor for For class that is derived from Seq
	For(int first, int last, int step) {
		this.first = first;
		this.step = step;
		this.last = last;
		countFor++;
	}
	//this method converts numbers into string
	public String toString() {
		String newString = "{ " + first + " to " + last + " by " + step + " }";
		return newString;
	}
	//overwrite abstract function in Seq for upperBound
	public int upperBound() {
		if(step > 0)
			return last;
		else
			return first;
	}
	//method to get the count for which a For object is being created
	public static int getCount(){
		return countFor;
	}
}