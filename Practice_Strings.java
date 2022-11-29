public class Practice_Strings {
    public static void main(String[] args) {
        String name = "Yash";
        System.out.println(name.toLowerCase());
        String text = "Hi this is yash patel";
        System.out.println(text.replace(" ","_"));

        String letter = "Dear <|name|> ,thanks a lot";
       letter = letter.replace("<|name|>","yash");
        System.out.println(letter);

        String spaces = "Hi this string contains  double and  triple spaces";
        System.out.println(spaces.indexOf("  "));
        System.out.println(spaces.indexOf("   "));
        String nstring = "Dear yash,\nThis java course is nice.\nThanks";
        System.out.println(nstring);
    }
}
