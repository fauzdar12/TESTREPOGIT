package javapackage;

public class Static5 {
	static int x=5;
	int y=1;

	//static method
	public static void a() {
		x=10;
		System.out.println(x);


	}

	//non static method
	public void b() {
		x=15;
		System.out.println(x);
	a();

	}
	public static void main(String[] args) {
		Static5 s5=new Static5();
s5.b();
	}

}
