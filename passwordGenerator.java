import java.util.Random;
import java.util.Scanner;

public class passwordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of password:");
        int length = sc.nextInt();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialChar = ",.<>/?+|[]{}-_)(*&^%$#@!~`";
        String comb = upper + lower + specialChar + num;
        char[] password = new char[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            password[i] = comb.charAt(r.nextInt(comb.length()));

        }
        System.out.println("Generated Password is: " + new String(password));

    }

}