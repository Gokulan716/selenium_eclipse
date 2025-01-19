package Practice_Questions;

/*
Overload a calculate method in a class to compute square, cube, and power.
The method should compute:
Square of an integer.
Cube of an integer.
Power of a base and exponent.
*/
public class QA11_MathOperation {	
	// Square of an integer
    int calculate(int num) {
        return num * num;
    }
    // Cube of an integer
    int calculate(int num, boolean isCube) {
        return num * num * num;
    }
    // Power of a base raised to an exponent
    double calculate(double base, double exponent) {
        return Math.pow(base, exponent);
    }

	public static void main(String[] args) {
		
		QA11_MathOperation m= new QA11_MathOperation();
		System.out.println("Area of Square : "+m.calculate(10));
		System.out.println("Cube of an integer : "+m.calculate(2, true));
		System.out.println("2 raised to the power 4 : "+m.calculate(2, 4));
		

	}

}
