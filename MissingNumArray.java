package w2.d2;

public class MissingNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//   declare array
		
		int[] a= {1,2,3,4,6};
		
		int missing;
		
		for(int i=1;i<a.length;i++) {
			
			missing=a[i-1]+1;   // a[1-1]+1  missing=2
			
			//System.out.println("Input in missing"+missing);
			
			if(a[i]!=missing) {
				
				System.out.println(missing);
			}
			
		}
		
	
		
		
		
		
		

	}

}
