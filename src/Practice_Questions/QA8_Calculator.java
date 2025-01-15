package Practice_Questions;

/*
Create a Calculator class that performs addition for two numbers, three numbers, and an array of numbers. 
Write overloaded add methods to handle these cases. 
*/
public class QA8_Calculator {
	
	void add(int a, int b) {
		System.out.println("Total sum of two numbers : "+a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println("Total sum of three nums : "+a+b+c);
	}

	void add (int[] nums) {
		int total =0;
		
		for(int num: nums) {
			total+= num;
		}
		System.out.println("Total of sum array: "+total);
	}

	public static void main(String[] args) {
		QA8_Calculator ca= new QA8_Calculator();
		ca.add(10, 20, 30);
		ca.add(20, 30);
		int arr[]= {10, 20, 60};	
		ca.add(arr);
}
}
