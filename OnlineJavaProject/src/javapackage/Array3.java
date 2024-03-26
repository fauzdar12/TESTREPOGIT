package javapackage;

public class Array3 {
	   static int c[]= {15,22,3,5};
	   public static void passingarraytomethod(int c[]) {
		   int b=c[0];//15
		   
		   
		   for(int i=0;i<c.length;i++) {
			   if(b>=c[i]) {
				   System.out.println(b);
			   }
			   else {
				   System.out.println("ABCFD");
			   }
		   }
		                                             //answer==15,15,abcdf,15
	   }
	   public static void main(String[] args) {
		passingarraytomethod(c);
	}
}