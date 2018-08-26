package Common;

public class logicbuilder4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to find number is even or odd
		
		int num=103;
		
		if(num%2==0){
			
			System.out.println(num+" is even");
			
		}else{
			System.out.println(num+" is odd");
			
		}
		
		
		//Check from given array number is even or odd
		
		int num1[]={1,3,5,7,10,12,13};
		
		for(int i=0;i<num1.length;i++){
			
			if(num1[i]%2==0){
				
				System.out.println(num1[i]+":is even");
				
			}else{
				System.out.println(num1[i]+": is odd");
				
			}
			
		}

	}


}
