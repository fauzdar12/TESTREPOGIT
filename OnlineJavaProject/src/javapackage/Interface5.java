package javapackage;

public class Interface5  extends Ineritance1 implements Interface3,Interface4{

	@Override
	public void b() {
		System.out.println("B method");
		
	}

	@Override
	public void a() {
		System.out.println("A method");
		
	}
	public static void main(String[] args) {
		Interface5  i5=new Interface5 ();
		i5.a();
		i5.b();
		System.out.println(i5.roll);
	}

}
