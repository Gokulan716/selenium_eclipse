package Practice_Questions;

public class QA15_HDFC  extends QA15_Bank{
	@Override 
	void getInterestRate() {
		System.out.println("interest rate for HDFC bank = 15 %");
	}


	public static void main(String[] args) {
		QA15_HDFC h = new QA15_HDFC();
		h.getInterestRate();

	}

}
