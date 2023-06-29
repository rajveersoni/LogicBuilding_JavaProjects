import java.util.Scanner;
import java.util.Random;

public class SnakeWaterGun {
    public static void main(String[] args){
        // 0 for snake
        // 1 for water
        // 2 for gun
        int n = 1;
        while (n>0) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Snake, 1 for Water and 2 for Gun");
        int user = sc.nextInt();

        Random random = new Random(); // generates a random number
        int computer = random.nextInt(3);  // nextInt(x) means number will start from 0 with bound of (x-1)

        if (user == computer){
               System.out.println("Match Tie");
        }
        else if (user == 0 && computer == 1 || user == 1 && computer == 2 || user == 2 && computer == 0 )
            {
               System.out.println("You Win!!!");
        }
        else {
            System.out.println("Computer Win!!!");
        }
        System.out.println("Computer chose: " +computer);
        System.out.println();
        System.out.println("Want to Play again, press 0 to exit or 1 to continue: ");
        n = sc.nextInt();
        }
    }

}
