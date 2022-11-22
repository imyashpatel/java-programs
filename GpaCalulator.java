import java.util.Scanner;
public class GpaCalulator {
    public static void main(String[] args) {
        float total = 0;
        System.out.println("Grades Point Average Calculator ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of subject 1:");
        float a = sc.nextFloat();
        total = total + a;
        System.out.println("enter marks of subject 2:");
        float b = sc.nextFloat();
        total = total + b;
        System.out.println(" enter marks of subject 3:");
        float c = sc.nextFloat();
        total = total + c;
// forumla for finding grades per average of three subjects
        float cgpa = (total)/30;
        System.out.println("cgpa:" +cgpa);

    }
}
