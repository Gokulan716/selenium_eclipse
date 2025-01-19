package Practice_Questions;

/*
 Design a Shape class that has overloaded methods for calculating area.
Calculate the area of:
A rectangle (takes two parameters: length and breadth).
A circle (takes one parameter: radius).
A triangle (takes three parameters: sides of the triangle).
 */
public class QA10_Shape {

	double area(int l, int br){
	double 	area = l*br;
	return area;		
	}
	double area(int r) {
		
		double area = Math.PI*r*r;
		
		return area;
	}
	 double area(int s1, int s2, int s3) {
		 
		 double pr = (s1+s2+s3)/2.0;
		 double area = Math.sqrt(pr*(pr-s1)*(pr-s2)*(pr-s3));
		 return area;	 
	 }
	
	public static void main(String[] args) {
		
		QA10_Shape sh = new QA10_Shape();
		System.out.println("Area of Circle : "+sh.area(10));
		System.out.println("Area of Rectangle:  : "+sh.area(10, 20));
		System.out.println("Area of Triangle : "+sh.area(5,6,7));
	}
}
