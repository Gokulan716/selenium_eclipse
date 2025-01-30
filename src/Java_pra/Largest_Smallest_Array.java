package Java_pra;

public class Largest_Smallest_Array {
	
	

	public static void main(String[] args) {
		
		int a[]= {10, 20, 40, 2, 90, 50};
		
		int min = a[0];
		int max = a[0];
		 for (int i=1; i<a.length; i++) {
			 
			 if (a[i]<min) {
				 min = a[i];
			 }
			 
			 if (a[i]>max) {
				 max = a[i];
			 }
		 }
		
		 System.out.println(min);
		 System.out.println(max);

	}

}
