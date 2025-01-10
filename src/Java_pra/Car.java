package Java_pra;

public class Car {
	
	String Brand;
	int model;   
	Car(){
		Brand ="Honda";
	    model=2024;		
	}
	
	Car (String Brand,int model){
		
		this.Brand=Brand;
		this.model=model;
		
	}
	void PrintDetails() {
	    
	
		System.out.println("Brand: "+ Brand);
	
		System.out.println("Model: "+ model);
	}
	
	public static void main(String[] args) {
		
		Car c1= new Car();
		
		Car c2= new Car("Tata", 2023);
		 
		c1.PrintDetails();
		c2.PrintDetails();
	

	}
		
		

}
