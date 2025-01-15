package Java_pra;

public class QA3_Circle extends QA3_Shape{
	
	@Override
	 void draw(){
		 System.out.println("Drawing Circle");
	 }
	 
	 public static void main(String []args) {
		 QA3_Circle c= new QA3_Circle();
		 QA3_Shape s = new QA3_Shape();
		 c.draw();
		 s.draw();
		
	 }
}


