import java.util.Scanner;
//Java Program to Find Prime Numbers in a Given Range
public class primenos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper range ");
        int u = sc.nextInt();
        System.out.println("Enter the  lower range ");
        int l = sc.nextInt();
        int f = 0;
        for (int i = l; i <= u; i++) {
            f = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    f = 0;
                    break;
                }
                else 
                {
                    f = 1 ;
                }
            }
            if (f == 1) {
                System.out.println(i);
            } 
        }

    }
}
