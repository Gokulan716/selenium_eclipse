package Practice_Questions;

public class QA14_Car extends QA14_Vechical{
	
void move() {
		
		System.out.println("Car moves on four wheels\"");
	}


	public static void main(String[] args) {
		QA14_Vechical c= new QA14_Car();
		c.move();	
	}
}
