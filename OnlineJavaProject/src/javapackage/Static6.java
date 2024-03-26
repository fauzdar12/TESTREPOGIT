package javapackage;

public class Static6 {
	int x=10;
	static int y=5;
	
	public void a() {

		int z=10;
		System.out.println(z);

	}

public static void b()
{
	int a=5;
	System.out.println(a);
}

static int b=6;
	public static void main(String[] args) {
		Static6 s6=new Static6();
		s6.a();
		
		System.out.println(b);

	}
}
