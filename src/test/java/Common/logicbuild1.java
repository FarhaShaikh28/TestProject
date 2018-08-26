package Common;

public class logicbuild1 {
	
	public static void main(String args[]){
		
	//Count String length without string.length() function
		
		String s="Farha";
		
		System.out.println(s.length());
			
		char len[]=s.toCharArray();
		int count=0;
		
		for (char c : len) {
			
			count=count+1;
			
		} 
		System.out.println(count);
		
	}

}
