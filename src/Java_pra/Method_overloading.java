package Java_pra;

public class Method_overloading {
	
	void Show() {
		System.out.println("Method call");
	}
	 void Show(int a) {
		System.out.println("Method call with no:"+ a);
			
	}
	// we can't overload by change the order of args example below 
	
   /* void test(int a, double b) {}
	  void test(double a, int b) {}
	*/

	public static void main(String[] args) {
		
		Method_overloading ma = new Method_overloading();
		ma.Show();
		ma.Show(10);
		
		
/* 
Design a Shape class that has overloaded methods for calculating area.
Calculate the area of:
A rectangle (takes two parameters: length and breadth).
A circle (takes one parameter: radius).
A triangle (takes three parameters: sides of the triangle). 10h

Overload a calculate method in a class to compute square, cube, and power.
The method should compute:
Square of an integer.
Cube of an integer.
Power of a base and exponent. 11h

Write a program that overloads a method named print to handle different data types.
Print an integer.
Print a double.
Print a string. 11h

Implement an Animal class and its subclasses: Dog, Cat, and Bird.
Override the makeSound method in each subclass to provide specific sounds (e.g., Dog: "Bark", Cat: "Meow").
Call the overridden methods using a parent class reference. 11h

Write a program that demonstrates method overriding with the following hierarchy:
Vehicle class with a method move().
Subclasses:
Car: Print "Car moves on four wheels".
Bike: Print "Bike moves on two wheels". 11h

Create a Banking system with a base class Bank and subclasses: SBI, HDFC, and ICICI.
Override the getInterestRate() method to return different interest rates for each bank.
Demonstrate runtime polymorphism using a Bank reference. 
*/
	}

}
