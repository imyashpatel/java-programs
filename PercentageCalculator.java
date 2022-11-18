import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        System.out.println("sum of three numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of english:");
        float a = sc.nextFloat();
        System.out.println("enter marks of maths:");
        float b = sc.nextFloat();
        System.out.println("enter marks of chemistry:");
        float c = sc.nextFloat();
        System.out.println("enter marks of science:");
        float d = sc.nextFloat();
        System.out.println("enter marks of physics:");
        float e = sc.nextFloat();


        float sum = a + b + c + d + e;
        float per = (sum/500) *100;
        System.out.println("the earned percentage of student is :");
        System.out.println(per);
    }
}