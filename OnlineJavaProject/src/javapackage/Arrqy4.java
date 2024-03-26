package javapackage;

public class Arrqy4 {
	public static void main(String[] args) {
		//Defining multidimensional array
		int a[][]={{1,2,3,7},{4,5,6,8},{7,8,9,6}};
		
		int rows=a.length;
		System.out.println("The numbers of rows:" + rows);
		
		int columns=a[0].length;
		System.out.println("The total number of coolmns:" +columns);
		
		//outer loop
		for(int i=0;i<rows;i++) {
			
			//inner loop
			for(int j=0;j<columns;j++) {
				System.out.print(a[i][j]  +  "  ");
			}
			System.out.println();
		}
	}

}
