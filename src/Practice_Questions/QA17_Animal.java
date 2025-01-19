package Practice_Questions;

/*
Write a program with an abstract class Animal that has a constructor that initializes the name of the animal. 
Create two subclasses: Dog and Cat, that call the superclass constructor and print the animal's name. In the main method, 
create instances of Dog and Cat and call their methods to print their names. 
 */

public abstract class QA17_Animal {
	
	String name;
	
	QA17_Animal(String name)
	{
	   this.name=name;	
	}
	

}
