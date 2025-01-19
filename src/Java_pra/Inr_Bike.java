package Java_pra;

public class Inr_Bike implements Inr_Vechical{
	
	@Override
	public void start(){		
		System.out.println("Starting bike..");
	}
     @Override
	public void stop() {
    	 System.out.println("Stopping bike ...");
    	 
     }
	public static void main(String[] args) {
		Inr_Bike b = new Inr_Bike();
		
		b.start();
		b.stop();
		 

	}

}
