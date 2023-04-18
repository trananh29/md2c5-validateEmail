import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile(".s");
        // Matcher m= p.matcher("as as");
        // boolean b= m.matches();
        // System.out.println(b);
        // System.out.println(m.group());

        // boolean b2= Pattern.compile(".s").matcher("as as as").matches();
        // System.out.println(b2);
        boolean b3= Pattern.matches(".s", "as");
        System.out.println(b3);
    }
    
}
