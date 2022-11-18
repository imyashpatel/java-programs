import java.util.Scanner;
public class TwoNumAdd {
    public static void main(String[] args) {
        System.out.println("Addition of two numbers entered by user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1 :");
        int a = sc.nextInt();
        System.out.println("enter number2: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of these two numbers is:");
        System.out.println(sum);
    }
}
