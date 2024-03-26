package javapackage;

public class Methodoverloading6 {

	public static void main(String[] args) {
	System.out.println(Methodoverloading5.add(15, 30));
	System.out.println(Methodoverloading5.add(10.2, 6.8));//We can call static method With the help of class name there is no required  to create object method.
	
	
	//how to print A to Z
	for(char c='A'; c<='Z'; c++) {
		System.out.print(" " +c);
	}

	}

}
