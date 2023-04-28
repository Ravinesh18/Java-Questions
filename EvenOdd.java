//Java Program to Check Whether a Given Number is Even or Odd
import java.util.Scanner;
class EvenOdd
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No.");
        int n = sc.nextInt();
        int k = n ;
        if(k%2==0)
        System.out.println(n+" is a Even No.");
        else 
        System.out.println(n+" is a Odd No.");
    }
}