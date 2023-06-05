package code;
import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 System.out.print("Enter the Maths score: ");
		 double value1 = sc.nextDouble();

		 System.out.print("Enter the Physics score: ");
		 double value2 = sc.nextDouble();

		 System.out.print("Enter the Chemistry score: ");
		 double value3 = sc.nextDouble();

		 double sum = value1 + value2 + value3;
		 double average = sum / 3;

		 System.out.println("Addition: " + sum);
		 System.out.println("Average: " + average);

		 String grade;

		 if (average > 90) {
		 grade = "A";
		 } else if (average >= 80 && average <= 90) {
		 grade = "B";
		 } else if (average >= 70 && average < 80) {
		 grade = "C";
		 } else {
		 grade = "D";
		 }

		 System.out.println("Grade: " + grade);

		 sc.close();
	

	}

}
