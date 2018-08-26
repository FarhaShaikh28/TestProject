package Common;

public class logicbuilder6 {
	
	public static void main(String args[]){
		
		//palindrome of String without using reverse
		
		
		String str[]={"PPCOE","ABA","TTT","YaaY","PPPCCC"};
		String reverse = "";
		
		for(int i=0;i<str[i].length();i++){
			
			int len=str[i].length();
			char chstr[]=str[i].toCharArray();
			
			for(int j=len;j>=0;j--){
				
				reverse=reverse+chstr[j];				
			}
			
			System.out.println("reverse :"+reverse);
			if(reverse.equals(str[i])){
				
				System.out.println(str[i]+" is Palindrome");
			}else{
				System.out.println(str[i]+" is not Palindrome");
				
			}
			
		}
	}

}