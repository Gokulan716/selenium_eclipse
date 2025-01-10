package Java_pra;

public class Student {
	
	int rollNo;
	String name;
	
	Student(int rollNo){
		
		this.rollNo=rollNo;
	}
	
  Student(int rollNo, String name){
		
		this.rollNo=rollNo;
		this.name=name;
	}
  
  void PrintStuDetails() {
	  
	  System.out.println("Student Roll Number :"+rollNo);
	  System.out.println("Student Name :"+name);
  }


	public static void main(String[] args) {
		
		Student s1= new Student(511);
		
		Student s2= new Student(512, "Gokul");
		s1.PrintStuDetails();
		s2.PrintStuDetails();

	}

}
