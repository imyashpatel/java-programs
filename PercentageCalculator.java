import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        float total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total  marks out of :");
        int total_marks = sc.nextInt();
        System.out.println("enter marks of english:");
        float a = sc.nextFloat();
        total = total + a;
        System.out.println("enter marks of maths:");
        float b = sc.nextFloat();
        total = total + b;
        System.out.println("enter marks of chemistry:");
        float c = sc.nextFloat();
        total = total + c;
        System.out.println("enter marks of science:");
        float d = sc.nextFloat();
        total = total + d;
        System.out.println("enter marks of physics:");
        float e = sc.nextFloat();
        total = total + e;


        float per = (total * 100)/ (total_marks*5);
        System.out.println("the earned percentage of student is :");
        System.out.println(per);
    }
}
