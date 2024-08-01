import java.util.Random;
import java.util.Scanner;

    public class Rps  {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Welcome to Rock, Paper, Scissors!");
            System.out.println("Enter your choice (rock, paper, or scissors):");

            String userChoice = scanner.nextLine().toLowerCase();
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Please enter rock, paper, or scissors.");
                return; // Exit the program
            }
            String[] choices = {"rock", "paper", "scissors"};
            String computerChoice = choices[random.nextInt(3)]; // Pick randomly from choices

            System.out.println("Computer's choice: " + computerChoice);
            String result = getWinner(userChoice, computerChoice);
            System.out.println(result);
        }
        public static String getWinner(String userChoice, String computerChoice) {
            if (userChoice.equals(computerChoice)) {
                return "It's a tie!";
            }

            switch (userChoice) {
                case "rock":
                    return (computerChoice.equals("scissors")) ? "You win! Rock beats Scissors." : "You lose! Paper beats Rock.";
                case "paper":
                    return (computerChoice.equals("rock")) ? "You win! Paper beats Rock." : "You lose! Scissors beat Paper.";
                case "scissors":
                    return (computerChoice.equals("paper")) ? "You win! Scissors beat Paper." : "You lose! Rock beats Scissors.";
                default:
                    return "Invalid choice.";
            }
        }
    }



