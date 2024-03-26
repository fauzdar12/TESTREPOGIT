package javapackage;

public class Constructor2 {
	int id;
	String name;
	String adress;


	//Default constructor
	Constructor2(){
		System.out.println("Hello Costructor method");
	}

	//Parameterized Constructor
	Constructor2(int s,String t,String u){
		this.id	=s;
		name=t;
		adress=u;
	}

	//Non static method 
	public void d() {
		System.out.println(id+ " " +name+ " " +adress);
	}
	public static void main(String[] args) {
		//default constructor
		Constructor2 c2=new Constructor2();
		
		//Parameterized constructor
		Constructor2 c3=new Constructor2(1,"Saman" , "Malad");
		c3.d();
		Constructor2 c4=new Constructor2(1,"Ayush" , "London");
		c4.d();
		
	}
}
