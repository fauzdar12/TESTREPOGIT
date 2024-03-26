package javapackage;

   public class StaticMethod2 
   {
	int roll;//Declaring variable
	String name;
	String college;

   public static void main(String[]args) {
	   
	   StaticMethod2 s2=new StaticMethod2();
	   
   System.out.println(s2.roll);//Default value of int is 0
   System.out.println(s2.college);//default value id null
   System.out.println(s2.name);//default value is null
   
   }
   }