package javapackage;

public class Array2 {

	public static void main(String[] args) {
		int b[]= {1,2,3,4,5};//defining th int array
		String s[]= {"Hello","Java"};//Defining the string array
		Object a[]= {1,2,3,4,5,"Hello","Java"};//Defining Object array
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(s.length);
		
		System.out.println(a[3]);
		System.out.println(a[2]);
		System.out.println(b[3]);
		System.out.println(s[1]);
		a[1]="Selenium";
		System.out.println(a[1]);

	}

}
