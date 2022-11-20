import java.util.Scanner;
public class KmConversion {
    public static void main(String[] args) {
        System.out.println("enter total numbers of kilometers:");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        double miles = a * 0.621371D;
        System.out.println("total miles:"+miles);

    }
}

