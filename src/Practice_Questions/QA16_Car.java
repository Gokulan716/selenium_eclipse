package Practice_Questions;

public class QA16_Car implements QA16_Engine, QA16_Wheel {

	@Override
	public void rotateWheels() {
		System.out.println("Wheel roatating");
		
	}

	@Override
	public void startEngine() {
		System.out.println("Engine Staring..");
	}
	public static void main(String[] args) {
		QA16_Car ca= new QA16_Car();
		ca.startEngine();
		ca.rotateWheels();

	}

}
