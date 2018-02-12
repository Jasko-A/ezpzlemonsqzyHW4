public class ForUser {

	static int flag = 0;

	public static int sum1(For r) {
		try {
			int sum = 0;
			ForIt temp = new ForIt(r);
			if(temp.hasNext()){
				while(temp.hasNext()) {
					sum += temp.next();
				}
			}

			else
				sum = 0;

			return sum;
		}
		catch UsingIteratorPastEndException e{
			throw new UsingIteratorPastEndException();
		}
		
	}

	public static int sum2(For r) {
		int sum = 0;
		ForIt temp = new ForIt();
		try {
			if temp.next()
		}
		
	}
}