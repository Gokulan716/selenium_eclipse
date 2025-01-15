package Java_pra;

public class Construcator_Overloading {
	
	
	Construcator_Overloading(){
		
	  System.out.println("Default Constructor");
		
	}
	
	
	Construcator_Overloading(int a, String n){
		
		  System.out.println("Number Enterted: "+a+" Your Name: "+n);
	  
		
	}	

	public static void main(String[] args) {
		
		Construcator_Overloading c= new Construcator_Overloading();
		
		Construcator_Overloading d= new Construcator_Overloading(10, "Gokul");
        
	}

}
