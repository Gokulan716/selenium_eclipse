package Java_pra;

public class QA3_Circle extends QA3_Shape{
	
	@Override
	 void draw(){
		 System.out.println("Drawing Circle");
	 }
	 
	 public static void main(String []args) {
		 QA3_Circle c= new QA3_Circle();
		 QA3_Shape s = new QA3_Shape();
		 c.draw();
		 s.draw();
		
	 }
}


/*
Create a parent class Parent with a method show() that prints "Parent class".
Create a child class Child that overrides the show() method to print "Child class".
Use the super keyword to call the parent class's show() method in the child class. 4m

Write a program to demonstrate constructor chaining where:
A Base class has a constructor that prints "Base class constructor".
A Derived class inherits the Base class and its constructor calls the parent constructor using super(). 4m

Create a Shape class with a method draw(). Create two subclasses Rectangle and Triangle that override the draw() method. Test all classes by calling the draw() method. 4m


Create a class with overloaded methods (same method name, different parameters).

Create another class that inherits it and overrides one of the methods. Test both overloading and overriding. 4m

*/