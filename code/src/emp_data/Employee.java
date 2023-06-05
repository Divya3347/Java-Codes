package emp_data;

public class Employee {
	String name;
    int yearOfJoining;
    double salary;
    String address;

    Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    void display() {
        System.out.printf("%-10s %-20d %s\n", name, yearOfJoining, address);
    }
}
