public class ForUser {

	public static int sum1(For r) {
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
}