package javapackage;

public class Eh2 {

	public static void main(String[] args) {

		String s=null;
		try {
		System.out.println(s.length());
		}
		catch(Exception e) {
			e.printStackTrace();
		System.out.println(e);	
		}
		
System.out.println("Exception Handled");

	}
	}

