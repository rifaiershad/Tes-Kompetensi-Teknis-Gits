import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email {
   private static final String regex = 
           "^((?=.{0,20}@)[_A-Za-z0-9-+]+\\.?[_A-Za-z0-9-+]+@[^-][A-Za-z0-9-]+(.co.id|.id))$";

   public static void main(String args[]) {
       List<String> emails = new ArrayList<String>();
       // valid email addresses
       emails.add("oooooooooooooooooooo@example.co.id");
       emails.add("susanto.kuro@example.id");
       emails.add("dewi@example.co.id");
       //invalid email addresses
       emails.add("dewi.example.id");
       emails.add("sus#example.com");
       emails.add("@example.me.org");

       Pattern pattern = Pattern.compile(regex);

       for (String value : emails) {
           Matcher matcher = pattern.matcher(value);

           System.out.println("Email " + value + " "+ (matcher.matches() ? "valid" : "invalid"));
       }
   }
}
