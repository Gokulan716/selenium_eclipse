package Practice_Questions;

/*
Create a class with overloaded methods (same method name, different parameters).
Create another class that inherits it and overrides one of the methods. Test both overloading and overriding. 4m
*/

public class QA7_Base_Class {
	
void display(){
		
		System.out.println("Display method Base");
	}
	
	void display(int a) {
		
		System.out.println("Number : "+a );
	}
	
	void display(int age, String name) {
		
		System.out.println("Name : "+name +", Age: "+ age);
	}

}
