package Common;

public class logicbuilder3 {
	
	
	public static void main(String args[]){
		
		//String to find number of instances of same word
		int count1=0;
		int count2=0;
		int count3=0;
				
		String s="Farha Ayaz Shaikh Farha Shaikh Farha Ayaz Farha";
		
		String s1[]=s.split(" ");
		
			
		for (String string : s1) {
			System.out.println(string);
		}
		///String s11=s1[0];
		//System.out.println("s1: "+s11);
		for(int i=0;i<s1.length;i++){
			
					
			if(s1[i].equals("Farha")){
				
				count1=count1+1;
				
				
			}else if(s1[i].equals("Ayaz")){
				
				count2=count2+1;
				
				
			}else if(s1[i].equals("Shaikh")){
				
				count3=count3+1;
				
				
			}	
			
		}
		System.out.println("Farha: "+count1);
		System.out.println("Ayaz: "+count2);
		System.out.println("Shaikh: "+count3);
		
		
	}

}
