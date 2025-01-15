package Practice_Questions;

public class QA4_Child extends QA4_Pratent{
	
	@Override
	void show() {
		super.show();
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		
		QA4_Child c1= new QA4_Child();
		c1.show();
	}
}
