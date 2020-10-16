package w2.d2;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a= {2,4,7,9,10};
		
		int[] b= {2,1,8,5,10};
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				if(a[i]==b[j]) {
					
					System.out.println("The intersect elements are"+a[i]);
				}
				
			}
		}
		
		

	}

}
