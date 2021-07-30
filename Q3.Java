import java.text.SimpleDateFormat;
import java.util.Date;

public class KonversiWaktu {
   public static void main(String [] args) throws Exception {
       SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm a");
       Date date = parseFormat.parse("1:30 PM");
       System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));
   }
}
