package javapackage;

public class EH6 {

	public static void main(String[] args) {
		try {
	int i=22/2;
		}
	finally {
		
		System.out.println("Finally wil execute always");
		try {
			int a=15/0;
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
	
		}
		
		System.out.println("Exception handled");

	}

}
