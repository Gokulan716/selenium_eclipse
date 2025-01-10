package Java_pra;

//Q3. Create a class Book where:
//The default constructor calls a parameterized constructor.
//The parameterized constructor initializes the book’s title and price.
//Add a method to display the book details. 


public class Book {
	
	String Title;
	int price;
	
	Book(){
		this("", 0);
		
	}
	Book(String Title,int price){
		
		this.Title=Title;
		this.price=price;
	}
	
	void PrintBookDetails() {
		
		System.out.println("Book Name :" +Title);
		System.out.println("Book Price :" +price);
		
	}

	public static void main(String[] args) {
		
		Book b1= new Book();
		b1.PrintBookDetails();

	}

}
