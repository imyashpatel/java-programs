import java.sql.SQLOutput;
import java.util.Scanner;
public class Product_Two_Numbers {
    public static void main(String[] args) {
        System.out.println("Multiplication of two numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int n1 = sc.nextInt();
        System.out.println("enter second number:");
        int n2 = sc.nextInt();
        int mul = n1 * n2;
        System.out.println("the product of two numbers is:" +mul);


    }
}
