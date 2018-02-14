public class AList {

	
	protected String tempString;

	AList() { 	//constructor that initializes the tempString variable
		tempString = "";
	}

	public void add(Seq s) {
		
		tempString = tempString + s + " ";
	}

	public void add(AList a) {
		
		tempString = tempString + a + " ";
	}

	public void add(int i) {
		Integer x = new Integer(i);
		tempString = tempString + x.toString() + " ";
	}
	//overloads toString method for class and makes it custom to assignment guidelines
	public String toString() {
		if(tempString == "") {	//if tempstring is empty print the default [  ]
			return "[  ]";
		}
		String newString = "[ " + tempString + "]"; 
		return newString;
	}
	
}