package Practice_Questions;

/*
 Write a program that overloads a method named print to handle different data types.
Print an integer.
Print a double.
Print a string. 
 */
public class QA12_Diffrent_DataType {
	   // Print an integer
    void print(int num) {
        System.out.println("Integer: " + num);
    }

    // Print a double
    void print(double num) {
        System.out.println("Double: " + num);
    }

    // Print a string
    void print(String text) {
        System.out.println("String: " + text);
    } 

	public static void main(String[] args) {	
		QA12_Diffrent_DataType dd= new QA12_Diffrent_DataType();
		dd.print(2.9);
	    dd.print(10);
	    dd.print("Gokul");
	}
}
