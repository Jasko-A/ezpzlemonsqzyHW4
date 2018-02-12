public class ForUser {



	public static int sum1(For r) {
		int sum = 0;
		try {
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
		catch (UsingIteratorPastEndException e){
			// throw new UsingIteratorPastEndException();
		}
		return sum;
	}

	public static int sum2(For r) {
		int sum = 0;
		int flag = 0;  // setting a flag
		ForIt temp = new ForIt(r);

		while(flag == 0){   // looping through the try and catching until exception happens
			try {
				if (flag == 0){
					sum += temp.next();
				}
			} catch (UsingIteratorPastEndException e){
				flag = 1;
			}
		}

		return sum;
	}
}
