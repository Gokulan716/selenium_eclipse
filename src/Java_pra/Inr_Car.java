package Java_pra;

public class Inr_Car implements Inr_Vechical{
	
	@Override
	public void start() {
		System.out.println("Staring carr ...");
	}

	@Override
	public void stop() {
		System.out.println("Stopping car ...");
		
	}

	public static void main(String[] args) {
	
		Inr_Car c= new Inr_Car();
		c.start();
		c.start();

	}

}
