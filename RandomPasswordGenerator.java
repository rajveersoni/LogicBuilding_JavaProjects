import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

        static char[] SYMBOLS = "^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
        static char[] LOWERCASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        static char[] UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        static char[] NUMBERS = "0123456789".toCharArray();
        static char[] ALL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
        static Random rand = new SecureRandom();

        public static String getPassword(int length) {
            char[] password = new char[length];

            //getting the password for the first 4 letter where every letter exist
            password[0] = UPPERCASE[rand.nextInt(UPPERCASE.length)];
            password[1] = LOWERCASE[rand.nextInt(LOWERCASE.length)];
            password[2] = NUMBERS[rand.nextInt(NUMBERS.length)];
            password[3] = SYMBOLS[rand.nextInt(SYMBOLS.length)];

            //getting the letter for rest of the spaces
            for (int i = 4; i < length; i++) {
                password[i] = ALL_CHARS[rand.nextInt(ALL_CHARS.length)];
            }

            //mixing it for the more secure version of it
            for (int i = 0; i < password.length; i++) {
                int randomPosition = rand.nextInt(password.length);
                char temp = password[i];
                password[i] = password[randomPosition];
                password[randomPosition] = temp;
            }

            return new String(password);
        }

        public static void main(String[] args) {
            System.out.print("Enter the length of password (must be greater than 4 letter): ");
            Scanner ip = new Scanner(System.in);
            int n = ip.nextInt();
            if (n<4){
                System.out.println("Please, Enter the length greater than 4");
            }else {
                System.out.println(getPassword(n));
            }

        }
    }

