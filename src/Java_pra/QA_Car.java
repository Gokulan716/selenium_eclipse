package Java_pra;

public class QA_Car extends QA_Vehicle{
	
	void drive () {
		
		System.out.println("Wheeeeee...");
	}

	public static void main(String[] args) {
		
		QA_Car c = new QA_Car();
		c.start();
		c.drive();
		
	}

}


