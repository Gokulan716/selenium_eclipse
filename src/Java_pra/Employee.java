package Java_pra;

class Employee {
    int id;
    String name;
    double salary;

    // Default constructor
    Employee() {
        this(0, "Unknown", 0.0); // Calling the parameterized constructor
        System.out.println("Default constructor called");
    }

    // Constructor with only ID
    Employee(int id) {
        this(id, "Unknown", 0.0); // Calling the parameterized constructor
        System.out.println("Constructor with ID called");
    }

    // Constructor with ID and Name
    Employee(int id, String name) {
        this(id, name, 0.0); // Calling the parameterized constructor
        System.out.println("Constructor with ID and Name called");
    }

    // Constructor with ID, Name, and Salary
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Constructor with ID, Name, and Salary called");
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Using default constructor
        Employee emp1 = new Employee();
        emp1.displayDetails();

        System.out.println();

        // Using constructor with only ID
        Employee emp2 = new Employee(101);
        emp2.displayDetails();

        System.out.println();

        // Using constructor with ID and Name
        Employee emp3 = new Employee(102, "Alice");
        emp3.displayDetails();

        System.out.println();

        // Using constructor with ID, Name, and Salary
        Employee emp4 = new Employee(103, "Bob", 50000);
        emp4.displayDetails();
    }
} 