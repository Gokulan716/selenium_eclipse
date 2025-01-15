package Practice_Questions;

public class QA7_Main_Class extends QA7_Base_Class{
	
	@Override 
void display(){
		
		System.out.println("Display method Main");
	}

	public static void main(String[] args) {
		
		
		 // Create an object of Base class
		QA7_Base_Class Ba = new QA7_Base_Class();
		Ba.display();
		Ba.display(40);
		Ba.display(26, "Ram Kumar");
		
		
		 // Create an object of Derived class
		QA7_Main_Class Ma= new QA7_Main_Class();
		Ma.display(); // Call overridden method in Derived class
		Ma.display(10);
		Ma.display(26, "Gokul");
		

	}

}
