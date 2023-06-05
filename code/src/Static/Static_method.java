package Static;

public class Static_method {
 public static int add(int a, int b) {
    return a +b;
   }

  public static void main(String[] args) {
     int sum = Static_method.add(5, 10);
     System.out.println("Sum: " + sum);
   }
}
