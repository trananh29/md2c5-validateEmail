import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX= "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)";

    public EmailExample() {
        pattern= Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String Regex) {
        matcher = pattern.matcher(Regex);
        return matcher.matches();
    }
    public static void main(String[] args) {
        boolean b3= Pattern.compile(EMAIL_REGEX).matcher("anh@gmail.com").matches();
        System.out.println(b3);
       boolean b4 = Pattern.matches(EMAIL_REGEX, "hoananh@gmail.com");
        System.out.println(b4);
        boolean b5 = Pattern.matches(EMAIL_REGEX, "12");
        System.out.println(b5);
    }

    
}
