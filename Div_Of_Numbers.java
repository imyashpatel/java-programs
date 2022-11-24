import java.util.Scanner;
public class Div_Of_Numbers {
    public static void main(String[] args) {
        System.out.println("Division of two numbers");
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter Dividend:");
        int d1 = sc.nextInt();
        System.out.println("enter divisor:");
        int d2 = sc.nextInt();

        int div = d1 / d2;
        System.out.println("the Quotient of two numbers is:"+div);
    }
}
