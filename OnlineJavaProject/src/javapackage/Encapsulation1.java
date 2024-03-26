package javapackage;

public class Encapsulation1 {
	String name;
	int b;
	String naam;
	final int c=5;
	
	//Final variable
	public  void a() {
		//c=4; cant change the value of final
	}
	//final method
	final void d() {
		System.out.println("Final method");
	}
	public void setname(String s) {
		this.name=s;  //its a keyword use of instance variable of current class;
		this.b=2;
		
		System.out.println(b);
		System.out.println(c);
	}
	public Object getname() {
		return name;
		
	}
	public Object sett(String t) {
		this.naam=t;
		return naam;
		
	}
	
}
