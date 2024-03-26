package javapackage;

public class Firstjava {
	int a=5;//called global varibale
	static int b=89;//called static variables

	public static void main(String[] args) {
	System.out.println("Jai mata Di");
	System.out.println("hello automation test engineer");
	amethod();
	bmethod();
	int c=58;//called local variable0

	}
	public static void amethod() {
		System.out.println("hello automation engineer");//can get print next line
		System.out.print("Hello java");//in this you can get same line printing statements
		System.out.println("Do test engineer");
	}
	
	public static void bmethod() {
		
		System.out.println("Hello Testing Engineer");
	}
}
