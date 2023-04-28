//Java Program to Find the Sum of Even and Odd Numbers
import java.util.Scanner;
class SumEvenOdd {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the No. of Elements");
        int n = Sc.nextInt();
        int[] arr = new int[n];
        int sum1 = 0, sum2 = 0;
        System.out.println("Enter the Elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        System.out.println("The Elements are :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 == 0)
              { sum1 = sum1 + arr[j];
              }
            else
               { sum2 = sum2 + arr[j];
               }
        }
        System.out.println("Sum of Even No. " + sum1);
        System.out.println("Sum of Odd No. " + sum2);

    }
}