package Common;

public class Compareobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello";
		String s2="Hello";
		
		System.out.println(s1==s2);
		
		System.gc();
		
		System.out.println(s1);
				

	}
	
	public void finalize(){System.out.println("object is garbage collected");}  

}
