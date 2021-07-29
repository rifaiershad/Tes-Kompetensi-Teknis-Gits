import java.util.Scanner;

public class Palindrome
{
    public static void main(String args[])
    {
        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Input Kata:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("Kata palindrom.");
        }
        else
        {
            System.out.println("Kata bukan palindrom.");
        }
    }
}
