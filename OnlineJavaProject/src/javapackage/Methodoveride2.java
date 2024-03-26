package javapackage;

public class Methodoveride2 extends MethodOverride1{
	public void eat() {
		System.out.println("you are eating");
		
	}

	public static void main(String[] args) {
		MethodOverride1 m1=new MethodOverride1();
		m1.eat();

	}

}
