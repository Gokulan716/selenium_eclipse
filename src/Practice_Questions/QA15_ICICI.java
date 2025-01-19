package Practice_Questions;

public class QA15_ICICI  extends QA15_Bank{
	
	@Override 
	void getInterestRate() {
		System.out.println("interest rate for ICICI bank = 13%");
	}


	public static void main(String[] args) {
		QA15_ICICI i = new QA15_ICICI();
		i.getInterestRate();

	}

}
