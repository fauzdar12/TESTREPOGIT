package javapackage;

public class Unaryoperator2 {

	public static void main(String[] args) {
		String s="'hello automation tester";
		int c=s.length();
		int a=10;
		
		int b =10;
		System.out.println("The total number of charcters is:"+c);
		System.out.println(a++);//10,11
		System.out.println(a++ + ++a);//11,12,13,13=11+13=24
		System.out.println(a + a++);//,13,13,14=26 
		System.out.println(b++ + b--);//10,11,11,10
		System.out.println(a++ + b++);//14,15,10,11
		//System.out.println(b);//10
		
				

	}

}
