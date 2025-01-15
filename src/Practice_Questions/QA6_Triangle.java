package Practice_Questions;

public class QA6_Triangle  extends QA6_Shape{
	@Override 
	void draw() {
		System.out.println("Drawing Triangle ");
		}
	public static void main(String args []) {
		
		QA6_Triangle tr = new QA6_Triangle();
		tr.draw();
		
	}

}
