package w1.d1;

public class Sortingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] den= {20,6,34,1,89};
		
		int temp;
		
		for(int i=0;i<den.length;i++) {
			
			for(int j=i+1;j<den.length;j++) {
				
				if(den[i]>den[j]) {
					
					temp=den[i];
					den[i]=den[j];
					den[j]=temp;
					}
				
				
			}
		}
		
		System.out.println("ASCENDING");
		for(int i=0;i<den.length;i++) {
			System.out.println(den[i]);
		}
		
		System.out.println("SECOND LARGEST");
		
	    for(int i=den.length-2;i==den.length-2;i++) {
	    	System.out.println(den[i]);
	    }
		
		
		System.out.println("DESCENDING");
		for(int i=den.length-1;i>=0;i--) {
			System.out.println(den[i]);
		}
		

	}

}
