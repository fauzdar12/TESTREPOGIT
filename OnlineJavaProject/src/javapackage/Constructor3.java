package javapackage;

public class Constructor3 {
	Constructor3(){
		System.out.println("No arguments constructor");
	}
	Constructor3(int a){
		System.out.println("Int Arguments Constructor");
	}
	Constructor3(String b){
		System.out.println("String Arguments Constructors");
	}
	public static void main(String[] args) {
		Constructor3 c3=new Constructor3();
		Constructor3 c4=new Constructor3(1);
		Constructor3 c5=new Constructor3("Hello");
	}
	

}
