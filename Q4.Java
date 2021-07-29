import java.util.Scanner;
public class Reverse {
    public static void main(String[] args)
 {
 System.out.println("Input Kalimat:");
 
 Scanner read = new Scanner(System.in);
 String str = read.nextLine();
 
 StringBuilder sb = new StringBuilder(str);
 
 System.out.println("Kalimat Putar Balik:");
 System.out.println(sb.reverse().toString());
 }
}
