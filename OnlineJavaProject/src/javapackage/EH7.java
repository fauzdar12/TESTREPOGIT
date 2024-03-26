package javapackage;

public class EH7 {
	public static void a(int age) {
		
		try {
			if(age<18) {
				throw new ArithmeticException("not applicable");
			}else {
				System.out.println("Applicable");
			}
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}

	public static void main(String[] args) throws InterruptedException ,NullPointerException,ArithmeticException,Exception{
		Thread.sleep(3000);
		a(15);
		a(19);

	}

}
