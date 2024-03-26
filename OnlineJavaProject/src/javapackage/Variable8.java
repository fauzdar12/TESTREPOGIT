package javapackage;

public class Variable8 {
	int a=10;
	static int b=15;

	public static void main(String[] args) {
		int c=12;
		System.out.println(c);
		System.out.println(Variable8.b);
		Variable8 vb=new Variable8();
		System.out.println(vb.a);
		vb.f();
	
		
		
	}
	public static void f() {
		int s=46;
		String s1="Hi java automation";
		
		System.out.println(s1);
		System.out.println(s);
	}
	

}
