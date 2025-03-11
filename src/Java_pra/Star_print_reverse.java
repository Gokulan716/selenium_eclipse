package Java_pra;

public class Star_print_reverse {

	public static void main(String[] args) {
		 int n= 20;
		 
		 for(int i=1; i<=n; i++) {
			 
			for  (int s=1; s<=i; s++){
				 System.out.print(" ");
			 }
			 
		
				 for(int j=n; j>=i; j--) {
					 System.out.print("*");
				 }
			System.out.println("");
			
			
		 }

	}

}
