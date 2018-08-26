package Common;

public class logicbuild2 {
	
	public static void main(String args[]){
	
	//Sorting of Array
	int a[]= {10,30,20,0,60};
	
	int temp=0;
	
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length;j++){
					
			if(a[j]>a[i]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}	
		}
	}

	for (int k : a) {
		System.out.println(k);
	}
	
	
	}
	

}
