package Practice_Questions;

public class QA18_Developer extends QA18_Employee{
	
	@Override
	void getSalary() {
	
		System.out.println("Devloper Salary");
	}
	@Override
	void work() {
		System.out.println("Devloping apps and fixing the bugs");
	}

	public static void main(String[] args) {
		QA18_Developer d = new QA18_Developer();
		d.getSalary();
		d.work();
	}
}
