package emp_data;

public class Employee_data {
	public static void main(String[] args) {
		        
		        Employee employee1 = new Employee("Robert", 1994, 1000.0, "64C- WallsStreet");
		        Employee employee2 = new Employee("Sam", 2000, 2000.0, "68D- WallsStreet");
		        Employee employee3 = new Employee("John", 1999, 1500.0, "26B- WallsStreet");

		        System.out.printf("%-10s %-20s %s\n", "Name", "Year of joining", "Address");
		        employee1.display();
		        employee2.display();
		        employee3.display();
		    }
}
