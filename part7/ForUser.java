public class ForUser {

	

	public static int sum1(For r) {
		int sum = 0;
		ForIt temp = new ForIt(r);
		try {
			
			//ForIt temp = new ForIt(r);
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
			//throw new UsingIteratorPastEndException();
		}
		return sum;
	}

	public static int sum2(For r) {	 	//does not use hasNext function 
		int flag = 0;
		int sum = 0;
		ForIt temp = new ForIt(r);
		while(flag == 0) {
			try {
				if(flag == 0){
					sum += temp.next();
				}
			}
			catch (UsingIteratorPastEndException e){	//when exception is caught raise flag to exit out of loop.
				flag = 1;
			}
		}
		return sum;
	}
		
	
}