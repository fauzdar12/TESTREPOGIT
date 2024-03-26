package javapackage;

public class Encapsulation2 extends Encapsulation1 {
	/*final void d() {
	 * 
	 * final method cannot be overide  }*/

	public static void main(String[] args) {
		Encapsulation2 e2=new Encapsulation2();
		e2.setname("Selenium");
		
		System.out.println(e2.getname());
		e2.sett("Automation");
		System.out.println(e2.naam);
		
	}

}
