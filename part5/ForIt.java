
public class ForIt implements SeqIt{
	protected int first;
	protected int last;
	protected int step;
	protected int tempNum;

	ForIt(For r){
		this.first = r.first;
		this.last = r.last;
		this.step = r.step;
		this.tempNum = r.first; //store first element as a temp variable
	}

	public boolean hasNext() {
		
		if(step > 0) {
			if(tempNum <= last)
				return true;
			else
				return false;
		}
		else if(step < 0) {
			if(tempNum >= last)
				return true;
			else
				return false;
		}
		if (step == 0 && first <= last)
			return true;

		return false;
	}

	public int next() throws UsingIteratorPastEndException {

		if(!(hasNext())) {
			throw new UsingIteratorPastEndException();
			System.exit(1);
		}

		int temp = tempNum;	//stores element here so that it will be returned if it return true from hasNext()
		tempNum += step;
		return temp;
	}

}