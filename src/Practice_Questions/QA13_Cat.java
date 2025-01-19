package Practice_Questions;

public class QA13_Cat extends QA13_Animal{
	@Override
	void  makeSound() {
		System.out.println("Cat Meow Meow ...");
	}	
	public static void main(String[] args) {
		QA13_Animal d= new QA13_Cat();
		d.makeSound();
	}
}
