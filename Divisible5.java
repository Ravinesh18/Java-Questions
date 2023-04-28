//Java Program to Find the Number of Integers Divisible by 5
import java.util.Scanner;
public class Divisible5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a No.");
        int n = sc.nextInt();
        if(n%5==0)
        System.out.println("Its divisible by 5");
        else 
        System.out.println("Its not divisible by 5");
    }
}
