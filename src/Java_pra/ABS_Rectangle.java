package Java_pra;

public class ABS_Rectangle extends Shape{
	int l;
	int w;	
	ABS_Rectangle(int l, int w){	
		this.l=l;
		this.w=w;
	}
	
	@Override
	void area() {
	
		int ar= l*w;
		
	    System.out.println("Area of rectangle : "+ ar);
		
	}
	public static void main(String[] args) {
		
		ABS_Rectangle r= new ABS_Rectangle(100, 50);
		r.area();	
	}
}
