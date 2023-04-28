//Java Program to Check Whether a Number is Positive or Negative
import java.util.Scanner;;
public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a No.");
        int n = sc.nextInt();
        if(n>0)
        System.out.println("Its a Positive No.");
        else 
        System.out.println("Its a Negative No.");
    }
}
