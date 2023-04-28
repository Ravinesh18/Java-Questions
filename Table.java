//Java Program to Print Multiplication Table
import java.util.Scanner;
class Table
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No.");
        int n = sc.nextInt();
        int p = 1 ;
        for(int i = 1 ; i<=10 ; i++)
        {    p = n*i;
            System.out.println(n+"*"+i+"="+p);
        }
     }
    }