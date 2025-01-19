package Java_pra;

public class ABS_Circle extends Shape{
	
	
	int r ;
	ABS_Circle( int r ){
		 this.r=r;
	}
	
	@Override
	void area() {

		double ar = Math.PI* r*r;
		  System.out.println("Area of the circle : "+ ar);
		
	}

	public static void main(String[] args) {
		ABS_Circle c= new ABS_Circle(10);
		c.area();

	}

}
