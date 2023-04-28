//Java Program to Increment by 1 to all the Digits of a Given Integer
import java.util.Scanner;;
public class IncreDigit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a No.");
        int n = sc.nextInt();
        int k = n , r = 0 , s = 0 , m=0;
        while(k!=0){
            r=k%10;
            s = s*10 + r ;
            k= k/10;
        }
        while(s!=0){
            m=s%10;
            m++;
            System.out.print(m);
            s=s/10;
        }
    }
}
