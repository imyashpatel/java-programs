import java.util.Scanner;
public class GpaCalulator {
    public static void main(String[] args) {
        System.out.println("Grades Point Average Calculator ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of subject 1:");
        float a = sc.nextFloat();
        System.out.println("enter marks of subject 2:");
        float b = sc.nextFloat();
        System.out.println(" enter marks of subject 3:");
        float c = sc.nextFloat();
// forumla for finding grades per average of three subjects
        float cgpa = (a+b+c)/30;
        System.out.println("cgpa:" +cgpa);

    }
}
