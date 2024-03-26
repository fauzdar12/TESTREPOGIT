package javapackage;

public class EH1 {

	public static void main(String[] args) {
		try {
			
		
		int a=5/0;//Arithmetic exception
		}
		catch(ArithmeticException a) {
			a.printStackTrace();//give complete exception information
			System.out.println(a);//Only Exception info
			
		}
		catch(NullPointerException n) {
			System.out.println(n);
			
		}
		catch(ArrayIndexOutOfBoundsException ar) {
			System.out.println(ar);
			
		}
		catch(Exception cl) {
			System.out.println(cl);
		}
		
		System.out.println("Exception handled");

	}

}
