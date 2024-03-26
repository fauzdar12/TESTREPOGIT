package javapackage;

public class Static3 {
	int roll;//Declaring variable
	String name;
	static String college="DTSS College";//static variable

	Static3( int r,String n)
	{
		roll=r;
		name=n;
	}
	public void getresult() { 
		System.out.println(roll + " " + name + " " +college);


	}
}
