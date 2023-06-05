package code;
import java.util.Scanner;

public class LargestNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value : ");
		int value1 = sc.nextInt();
		System.out.print("Enter the second value : ");
		int value2 = sc.nextInt();
		int large = (value1>value2)? value1 : value2;
		System.out.println("The largest number is : " + large);
		sc.close();
	}
}