package javapackage;

public class Typecastingnarrowing {

	public static void main(String[] args) {
		double b =5.9;
		int a=(int)b;//manual casting double to int
		System.out.println(b);
		System.out.println(a);
		
		//string conversion into integer
		String s="10";
		int i=Integer.parseInt(s);
		System.out.println(i);
		
		//Integer  conversion into String
		int z=15;
		String t=String.valueOf(z);
		System.out.println(t);

	}

}
