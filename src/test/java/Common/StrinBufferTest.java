package Common;

public class StrinBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"PPCOE","ABA","TTTA","YaaY","PPPCCC"};
		
		for(int i=0;i<=arr[i].length();i++){
			
			StringBuffer strBuff=new StringBuffer(arr[i]);

			StringBuffer reverseStr=strBuff.reverse();			
			
			String revStr=reverseStr.toString();
			
			if(revStr.equals(arr[i])){
				System.out.println(arr[i]+" Is Palindrome");
			}else{
				
				System.out.println(arr[i]+" Is not a Palindrome");
			}
			
		}

	}

}
