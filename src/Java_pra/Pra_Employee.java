package Java_pra;

class Pra_Employee {
    int id;
    String name;
    double salary;

    // Default constructor
    Pra_Employee() {
        this(0, "Unknown", 0.0); // Calling the parameterized constructor
        System.out.println("Default constructor called");
    }

    // Constructor with only ID
    Pra_Employee(int id) {
        this(id, "Unknown", 0.0); // Calling the parameterized constructor
        System.out.println("Constructor with ID called");
    }

    // Constructor with ID and Name
    Pra_Employee(int id, String name) {
        this(id, name, 0.0); // Calling the parameterized constructor
        System.out.println("Constructor with ID and Name called");
    }

    // Constructor with ID, Name, and Salary
    Pra_Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Constructor with ID, Name, and Salary called");
    }

    // Method to display Pra_Employee details
    void displayDetails() {
        System.out.println("Pra_Employee ID: " + id);
        System.out.println("Pra_Employee Name: " + name);
        System.out.println("Pra_Employee Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Using default constructor
        Pra_Employee emp1 = new Pra_Employee();
        emp1.displayDetails();

        System.out.println();

        // Using constructor with only ID
        Pra_Employee emp2 = new Pra_Employee(101);
        emp2.displayDetails();

        System.out.println();

        // Using constructor with ID and Name
        Pra_Employee emp3 = new Pra_Employee(102, "Alice");
        emp3.displayDetails();

        System.out.println();

        // Using constructor with ID, Name, and Salary
        Pra_Employee emp4 = new Pra_Employee(103, "Bob", 50000);
        emp4.displayDetails();
    }
} 