package mutiple;

public class Main {
	public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, "1234567890", "123 Main St", 5000, "Software Development");
        Manager manager = new Manager("Jane Smith", 40, "9876543210", "456 Park Ave", 10000, "Operations");

        System.out.println("Employee Name: " + employee.name);
        System.out.println("Employee Age: " + employee.age);
        System.out.println("Employee Phone no: " + employee.phoneNumber);
        System.out.println("Employee Address: " + employee.address);
        System.out.println("Employee Salary: " + employee.salary);
        System.out.println("Employee Specialization: " + employee.specialization);
        System.out.println();

        System.out.println("Manager Name: " + manager.name);
        System.out.println("Manager Age: " + manager.age);
        System.out.println("Manager Phone no: " + manager.phoneNumber);
        System.out.println("Manager Address: " + manager.address);
        System.out.println("Manager Salary: " + manager.salary);
        System.out.println("Manager Department: " + manager.department);

   
    }
}
