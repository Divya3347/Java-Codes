package student;
import java.util.*;

public class Student {

	    String name;
	    int id;
	    int age;
	    String mobileNo;

	    void getData() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter name: ");
	        name = sc.nextLine();
	        
	        System.out.print("Enter ID: ");
	        id = sc.nextInt();
	        
	        System.out.print("Enter age: ");
	        age = sc.nextInt();
	        
	        System.out.print("Enter mobile number: ");
	        mobileNo = sc.next();
	        sc.close();
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Age: " + age);
	        System.out.println("Mobile Number: " + mobileNo);
	    }
	    
	    public static void main(String[] args) {
	        Student student = new Student();
	        student.getData();
	        student.display();
	    }
}