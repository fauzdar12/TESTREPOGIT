package javapackage;

public class RelationalOperator1 {

	public static void main(String[] args) {
		int a=200;
		int b =100;
		if(a!=b) {
			System.out.println("A is not equal to b");
		}
		else {
			System.out.println("A is equal to b");
		}
		//string comparison 1st way-Case sensitive
		String p="hello";
		String q="hello";
		if(p==q) {
			System.out.println("P and q are eaqual on the 1st way");
		}
		else {
			System.out.println("P and q are not eaqual on the 1st way");
		}
		
		
		//Secnnd way string comparison =case sensitive
		if(p.equals(q)) {
			System.out.println("P and Q are equal on the 2nd way");
		}
		else {
			System.out.println("P and Q are not equal on the 2nd way");
		}
		
		//Third way to comparison String in ignorance Case sensitive
		if(p.equalsIgnoreCase(q)) {
			
			System.out.println("P and Q are eaqual in third way");
		}
		else {
			System.out.println("P and Q are equal on third way");
		}
		
	}

}
