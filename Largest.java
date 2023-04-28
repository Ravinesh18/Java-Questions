//Java Program to Find the Largest Number Among Three Numbers
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three No.");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1 > n2 && n1 > n3)
            System.out.println("The Largest No. is : " + n1);
        else if (n2 > n1 && n2 > n3)
            System.out.println("The Largest No. is : " + n2);
        else
            System.out.println("The Largest No. is : " + n3);

    }
}
