import java.util.Scanner;

public class HelloWorld {
     public static void main(String[] args) {
     int num;
     Scanner sc=new Scanner(System.in);
     System.out.print("Input angka:");
     num=sc.nextInt();

     if (num%3==0&&num%5==0) {
        System.out.println("Hello World");}
     else if(num%5==0) {
        System.out.println("World");}
     else if (num%3==0) {
        System.out.println("Hello");}
     else {
        System.out.println("Bilangan tidak habis dibagi 3 atau 5");}
    }
}
