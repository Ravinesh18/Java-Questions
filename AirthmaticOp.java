//Java Program to Perform Arithmetic Operations
import java.util.Scanner;
public class AirthmaticOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two No.");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Enter Your Choice");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBSTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("5. EXIT");
        int ch = sc.nextInt();
        switch(ch)
        {
           case 1 :
           int sum = n1 + n2 ;
           System.out.println("Sum = "+sum);
           break;
           case 2 :
           int sub = n1-n2;
           System.out.println("Sub = "+sub);
           break;
           case 3 :
           int mul = n1*n2;
           System.out.println("Product = "+mul);
           break;
           case 4 :
           int div = n1/n2;
           System.out.println("Quotient = "+div);
           break;
           case 5 :
           System.out.println("Exiting");
           break ;
           default :
           System.out.println("Invalid Input");
        }
    }
    
}
