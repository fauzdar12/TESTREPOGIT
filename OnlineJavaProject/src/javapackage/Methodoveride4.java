package javapackage;

public class Methodoveride4 extends Methodoveride3 {
	public void run() {
		System.out.println("you are running");
	}

	public static void main(String[] args) {
		Methodoveride4 m4=new Methodoveride4 ();
		m4.run();
		Methodoveride3 m3=new Methodoveride3();
		m3.run();

	}

}
