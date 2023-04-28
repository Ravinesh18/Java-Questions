//Java Program to Extract Digits from a Given Number
import java.util.Scanner;
public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No.");
        int n = sc.nextInt();
        int k = n , r=0;
        while(k!=0)
        {
        r=k%10;
        System.out.println(r);
        k=k/10;
        }
    }
    
}
