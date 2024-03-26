package javapackage;

public class Ifelse4 {

	public static void main(String[] args) {
	int age=25; //Local variable
	int weight=25; //Local variable
	
	
	//Outer if block --If condition check first staemnet always whether its wrong or right
	if(age>18) {
		//inner block
		if(weight>20) {
			System.out.println("eligible");
		}
		else {
			System.out.println("Not eligible");
		}
		}else {
			System.out.println("age is not greater than 18");
		}
	
	}

}
