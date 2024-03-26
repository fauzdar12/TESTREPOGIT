package javapackage;

import java.util.Hashtable;

public class Hashtable1 {

	public static void main(String[] args) {
		Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
	
		ht.put(1,"jan");
		ht.put(2,"Feb");
		ht.put(3,"March");
System.out.println(ht.get(2));
System.out.println(ht.get(1));
		

	}

}
