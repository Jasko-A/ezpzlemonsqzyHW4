import java.util.*;
public class AList {

	protected ArrayList<Object> contents = new ArrayList<Object>();
	protected String tempString;

	AList() { 	//constructor that initializes the tempString variable
		tempString = "";
	}

	public void add(Seq s) {
		contents.add(s);
		//tempString = tempString + s + " ";
	}

	public void add(AList a) {
		contents.add(a);
		//tempString = tempString + a + " ";
	}

	public void add(int i) {
		Integer x = new Integer(i);
		contents.add(x);
		//tempString = tempString + x.toString() + " ";
	}
	//overloads toString method for class and makes it custom to assignment guidelines
	public String toString() {
		tempString = "";
		for(Object a : contents) {
			//if(a instanceof AList) {
			//	tempString = tempString + a + " ";
			//}
			//else {
				tempString = tempString + a + " "; 
			//}
		}
		if(tempString == "") {	//if tempString is empty print the default [  ]
			return "[  ]";
		}
		return "[ " + tempString + "]";
	}

	
	
}