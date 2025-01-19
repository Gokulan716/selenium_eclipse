package Practice_Questions;

public class QA15_SBI extends QA15_Bank {

	@Override 
	void getInterestRate() {
		System.out.println("interest rate for SBI bank =13.5 %");
	}

	public static void main(String[] args) {
		QA15_SBI s = new QA15_SBI();
		s.getInterestRate();

	}

}
