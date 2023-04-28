//Sum of Digits Program in Java
import java.util.Scanner;
public class SumofDigit {
  public static void main(String[] args) {
    Scanner sc  = new Scanner( System.in);
    System.out.println("Enter a No.");
    int n =  sc.nextInt();
    int sum = 0 , k = n , r = 0;
    while(k!=0)
    {
        r = k%10;
        sum = sum + r ;
        k=k/10;
    }
    System.out.println("Sum Of Digits "+sum);
  }  
}
