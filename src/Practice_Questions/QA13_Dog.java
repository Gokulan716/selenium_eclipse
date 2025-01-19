package Practice_Questions;

public class QA13_Dog extends QA13_Animal{

	@Override
	void  makeSound() {
		System.out.println("Dog barkess...");
	}
	
	public static void main(String[] args) {
		QA13_Animal d= new QA13_Dog();
		d.makeSound();

	}

}
