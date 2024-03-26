package javapackage;

public class Logicaloperator1 {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=20;
		
		//Logical operator==Its doseesnt check the sceond condition .if the fisrt condition will be false
		System.out.println(a<b && a<c);
		
		//Bitwise operator==  Its used to chcke all condition whether its true or false
		System.out.println(a<b & a<c);

	}

}
