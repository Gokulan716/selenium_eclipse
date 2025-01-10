package Java_pra;

public class Parent_B extends Parent_A{
	
	void name() {
		System.out.println("Parent_B");
		
	}
	 
	
	
	void Print() {
		
		super.name();
		name();
	}	

	public static void main(String[] args) {
		
		Parent_A b= new Parent_B();
		b.Print();

	}

}


 