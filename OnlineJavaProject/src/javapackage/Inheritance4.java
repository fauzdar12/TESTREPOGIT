package javapackage;

public class Inheritance4 extends Inheritance3 {
	
	
	public void multiply(int x,int y)
	{
		z=x*y;
		System.out.println("Product is :"+z);
	}
	public static void main(String[] args) {
		int x=20;
		int y=10;
		Inheritance4 i4=new Inheritance4();
		i4.add(x, y);
		i4.multiply(x, y);
		i4.subastract(x, y);
		
		
		/*i4.add(10,15);  this is another method to pass uusing single level inheritance 
		i4.subastract(20, 10);
		i4.multiply(15, 10);*/
		

	}

}
