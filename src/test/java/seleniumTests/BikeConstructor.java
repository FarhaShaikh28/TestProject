package seleniumTests;

public class BikeConstructor {
	
	public BikeConstructor(){
		System.out.println("Bike Constructor default");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BikeConstructor bike=new BikeConstructor();
		bike.BikeMethod();

	}
	
	public void BikeMethod(){
		System.out.println("BikeMethod");
	}

}
