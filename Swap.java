//Java Program to Swap Two Numbers
import java.util.Scanner;;
public class Swap {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Two No.");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int temp = 0 ;
        temp = n1 ;
        n1 = n2 ;
        n2 = temp ;
    System.out.println("Swapped No. "+n1+" "+n2);
    }
}
