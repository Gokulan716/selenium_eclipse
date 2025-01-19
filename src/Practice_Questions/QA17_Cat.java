package Practice_Questions;

public class QA17_Cat extends  QA17_Animal {

	QA17_Cat(String name) {
		super(name);
	}
	   void printName() {
		   System.out.println("Cat name is "+ name);}

	public static void main(String[] args) {
		QA17_Cat c = new QA17_Cat("Pinky");
		c.printName();
	}

}
