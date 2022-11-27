import java.util.Locale;

public class String_Methods {
    public static void main(String[] args) {
        String name = "yash";
        int value = name.length();
        System.out.println(value);
        String ucase = name.toUpperCase();
        System.out.println(ucase);
        String lcase = name.toLowerCase();
        System.out.println(lcase);
        String nonTrimmedString = "     yash    ";
        System.out.println(nonTrimmedString);
        String TrimmedString = nonTrimmedString.trim();
        System.out.println(TrimmedString);
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,3));
        System.out.println(name.replace("yas","eny"));
        System.out.println(name.startsWith("a"));
        System.out.println(name.endsWith("h"));
        System.out.println(name.charAt(2));
        String modifiedString = "yashash";
        System.out.println(modifiedString.indexOf("sh",3));
        System.out.println(modifiedString.lastIndexOf("as"));
        System.out.println(modifiedString.lastIndexOf("s",6));
        System.out.println(name.equals("patel"));
        System.out.println(name.equalsIgnoreCase("YASH"));


    }
}
