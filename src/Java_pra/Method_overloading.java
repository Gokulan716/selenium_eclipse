package Java_pra;

public class Method_overloading {
	
	void Show() {
		System.out.println("Method call");
	}
	 void Show(int a) {
		System.out.println("Method call with no:"+ a);
			
	}
	// we can't overload by change the order of args example below 
	
   /* void test(int a, double b) {}
	  void test(double a, int b) {}
	*/

	public static void main(String[] args) {
		
		Method_overloading ma = new Method_overloading();
		ma.Show();
		ma.Show(10);
	}

}
