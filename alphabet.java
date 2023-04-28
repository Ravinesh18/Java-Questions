//Java Program to Check Whether a Character is a Vowel, Consonant 
import java.util.Scanner;
public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a character");
        char ch = sc.next().charAt(0);
        if (ch =='a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U')
            System.out.println("Its a vowel");
        else
            System.out.println("Its a consonant");

    }

}
