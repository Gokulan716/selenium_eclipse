package Practice_Questions;

public class QA17_Dog extends QA17_Animal{

	QA17_Dog(String name) {
		super(name);
	}
   void printName() {
	   
	   System.out.println("Dog name is "+ name);
   }
	public static void main(String[] args) {
		QA17_Dog d= new QA17_Dog("Rammu");
		d.printName();
	

	}

}
