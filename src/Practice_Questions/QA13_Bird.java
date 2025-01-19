package Practice_Questions;

public class QA13_Bird extends QA13_Animal{

	@Override
	void  makeSound() {
		System.out.println("Bird Flying ...");
	}
	
	public static void main(String[] args) {
		QA13_Animal d= new QA13_Bird();
		d.makeSound();

	}

}
