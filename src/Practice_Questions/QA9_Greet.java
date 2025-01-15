package Practice_Questions;

public class QA9_Greet {
	/* 
	Write a program to overload a method called greet.
	The first method takes no arguments and prints "Hello!"
	The second method takes one argument (name) and prints "Hello, [name]!"
	The third method takes two arguments (name and title) and prints "Hello, [title] [name]!"
	*/
	void greet() {
		
		System.out.println("Hello");
	}
	void greet(String name) {
		System.out.println("Hello "+ name);
	}
	void greet(String name, String title) {
		System.out.println("Hello "+ name+" "+title);
	}
	public static void main(String[] args) {
		QA9_Greet gr = new QA9_Greet();
		gr.greet();
		gr.greet("Gokul");
		gr.greet("Gokulan,", "QA Engineer");
	}
}
