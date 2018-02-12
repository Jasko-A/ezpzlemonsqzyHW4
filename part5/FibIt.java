public class FibIt implements SeqIt{

	protected int first1;
	protected int first2;
	protected int last;
	protected int temp1,temp2;

	FibIt(Fib b) {
		//this.first1 = b.first1;
		//this.first2 = b.first2;
		this.last = b.last;
		this.temp1 = b.first1;
		this.temp2 = b.first2;
	}

	public boolean hasNext() {
		if(temp1 <= last)
			return true;
		else 
			return false;
	}

	public int next() throws UsingIteratorPastEndException{
		int t;
		if(!(hasNext())) {
			throw new UsingIteratorPastEndException();
			System.exit(1);
		}
		t = temp1;
		temp1 = temp2;
		temp2 = t + temp2;
		return t;
	}
}