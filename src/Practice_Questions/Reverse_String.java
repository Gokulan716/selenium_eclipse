package Practice_Questions;


public class Reverse_String {
	

	public static void main(String[] args) {
		
		String str = "Gokul My Name";
		
		String arr[] = str.split(" ");
		
		String temp ="";
		
  for (int i=arr.length-1; i>=0; i--) {
	  
	   temp+= arr[i]+" ";
  }
	
  System.out.println(temp);
	
	}

}
