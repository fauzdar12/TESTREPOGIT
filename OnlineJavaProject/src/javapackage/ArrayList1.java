package javapackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//creating arraylist
	ArrayList<Object>obj=new ArrayList<Object>();
	obj.add(1);
	obj.add("selenium");
	obj.add('I');
	obj.add(12<5);
System.out.println(obj);
	
	//Second way using iterator
	Iterator abc=obj.iterator();
	while(abc.hasNext()) {
		System.out.println(abc.next());
		
		
		//using for each loop
		for(Object bcd:obj) {
			System.out.println("Using for each loop:-" +bcd);
		}
	}

}
}
