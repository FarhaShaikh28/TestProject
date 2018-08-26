package Common;

public class logicbuilder5 {
	
	public static void main(String args[]){
	//String reverse without using reverse function
		
	String str="I have a pen";
	
	char c[]=str.toCharArray();
	String reversestring = "";
	
	for(int i=c.length-1;i>=0;i--){
		reversestring=reversestring+c[i];		
		}
	System.out.println("String reverse: "+reversestring);
	}
	
	
}

