package Practice_Questions;

public class QA18_Manager extends QA18_Employee {
	@Override
	void getSalary() {
      System.out.println("Manager salarly");	
	}
	@Override
	void work() {
		
		System.out.println("Manageing the workers");
	}
	
	public static void main(String[] args) {
		QA18_Employee m= new QA18_Manager();
		m.getSalary();
		m.work();
	}
}
