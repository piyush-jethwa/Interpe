import java.util.Scanner;
import java.util.Random;

class guessNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String play = "YES";

        while (play.equals("YES"))
        {
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;

            while(guess !=randNum)
            {
                System.out.println("Guess A Number Between 1 and 100:");
                guess = input.nextInt();
                tries++;

                if(guess == randNum)
                {
                    System.out.println("Excellent! You Have Guess Right Number");
                    System.out.println("It only took you " + tries + " guesses!");
                    System.out.println("Would You Like to Play Again? Yes Or No:");
                    play = input.next().toLowerCase();
                }
                else if (guess > randNum) {
                    System.out.println("Your Guess Num is Too High, Please Try Again");
                }
                else
                {
                    System.out.println("Your Guess Is Too Low, Please Try Again.");

                }
            }
        }
        input.close();
    }
}

