package seleniumTests;

public class StaticTest {
	static int a=10;
	
		  static{  
			  System.out.println("static block is invoked");  
		  
		  }  
		  
		  public static void main(String args[]){
			  
			  System.out.println("After static block");
			  System.out.println("Value of a: "+a);
		  }
}  

