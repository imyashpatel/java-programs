public class Encrypt_Decrypting {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // decrypting the grades

        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
