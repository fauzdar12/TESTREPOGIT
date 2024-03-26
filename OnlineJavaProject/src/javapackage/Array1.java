package javapackage;

public class Array1 {

	public static void main(String[] args) {
		
		//Defining array
	
		int a[]= new int[5];
		System.out.println(a.length);
		
		//Print default value of an array
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		a[0]=5;
		a[1]=6;
		a[2]=9;
		a[3]=7;
		a[4]=8;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
	}

}
