package Practice_Questions;

public class QA19_Circle implements QA19_Shape,QA19_Colorable {

	@Override
	public void color() {
		System.out.println("Color Red");
		
	}

	@Override
	public void draw() {
		System.out.println("Driaing circle");
		
	}

	public static void main(String[] args) {
		QA19_Circle c= new QA19_Circle();
		c.color();
		c.draw();

	}

}
