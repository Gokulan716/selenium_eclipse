package Java_pra;

public class QA2_Human extends QA2_Mammal{
	
	void think() {
		System.out.println("Think what to eat first");
	}
	public static void main(String[] args) {
		QA2_Human h = new QA2_Human();
		h.eat();
		h.walk();
		h.think();
		
	}

}
