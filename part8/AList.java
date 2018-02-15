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

	public AList expand() {
		
		AList temp_expand = new AList();
		for(Object a : contents) {

			if(a instanceof Seq) {
				Seq tempIte = (Seq) a;
				SeqIt tempIterator = tempIte.createSeqIt();
			
				while(tempIterator.hasNext()) {
					try {
						temp_expand.add(tempIterator.next());
					}catch(UsingIteratorPastEndException e){}
				}
			}
			else if(a instanceof AList) {
				AList temp_aList = (AList) a;
				temp_expand.add(temp_aList.expand());
			}
			else if(a instanceof Integer){
				Integer temp_int = (Integer) a;
				temp_expand.add(temp_int);
			
			}
		}
				
		return temp_expand;	
	}
	
	public AList flatten() {
		
		AList temp_flatten = new AList();
		for(Object a : contents) {
			if(a instanceof Seq) {
				Seq temp_seq = (Seq) a;
				temp_flatten.add(temp_seq);
			}
			else if(a instanceof Integer) {
				Integer temp_list = (Integer) a;
				temp_flatten.add(temp_list);
			}
			else if(a instanceof AList) {
				AList current = (AList) a;
				AList temp = new AList();
				
				temp = current.flatten();
				for(Object b : temp.contents) {
					if(b instanceof Seq){
						Seq temp_seq = (Seq)b;
						temp_flatten.add(temp_seq);
					}
					else if(b instanceof Integer) {
						Integer temp_int = (Integer)b;
						temp_flatten.add(temp_int);
					}

				}
			
			}
			
		}
		return temp_flatten;
	}

	//overloads toString method for class and makes it custom to assignment guidelines
	public String toString() {
		tempString = "";
		for(Object a : contents) {
			
				tempString = tempString + a + " "; 

		}
		if(tempString == "") {	//if tempString is empty print the default [  ]
			return "[  ]";
		}
		return "[ " + tempString + "]";
	}

	
	
}