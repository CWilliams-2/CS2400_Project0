import java.util.Random;
import java.util.Scanner;
//Commit 1
//Commit 2
//Commit 3

public class RPS {

    public static void main(String[] args) 
    {
        int playingGame = 1;
        
        while(playingGame == 1)
        {
            String computer = "";
            String user = "";
        
            computer = computerChoice();
        
            user = userChoice();
        
            determineWinner(computer, user);
        
            Scanner scnr=new Scanner(System.in);
            System.out.println("Play again? (yes/no)");
            String playAgain =scnr.nextLine();
            
            if(playAgain.equals("yes"))
                {
                    playingGame = 1;
                }
            else
                {
                    playingGame--;
                }
        }
        
        System.out.println("Thanks for playing.");
        
    }
    
    public static String computerChoice()
    {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(3) + 1;
        String computerChoice = "";
        
        if(randomNumber == 1)
            {
                computerChoice = "rock";
            }
        if(randomNumber == 2)
            {
                computerChoice = "paper";
            }
        if(randomNumber == 3)
            {
                computerChoice = "scissors";
            }
        return computerChoice;
    }
    
    public static String userChoice ()
    {
        Scanner scnr=new Scanner(System.in);
        String userChoice;
        String choice;
        System.out.println("Choose rock, paper, or scissors: ");
        choice = scnr.nextLine();
        
        if(isValidChoice(choice) == false)
            {
                while(isValidChoice(choice) == false)
                {
                    System.out.println("Choose either rock, paper, or scissors: ");
                    choice = scnr.nextLine();
                    isValidChoice(choice);
                }
            }
        
        userChoice = choice;

        return userChoice;
    }
    
    public static boolean isValidChoice (String choice)
    {
        if(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors"))
            {
                return true;
            }
        else
            {
                return false;
            }
    }
    
    public static void determineWinner(String computer,String user)
    {
        if((user.equals("rock") && computer.equals("scissors")) || (user.equals("scissors") && computer.equals("rock")))
        {
            System.out.println("You chose " + user + " and the computer chose " + computer + ". Rock smashes scissors.");
        }
        if((user.equals("scissors") && computer.equals("paper")) || (user.equals("paper") && computer.equals("scissors")))
        {
            System.out.println("You chose " + user + " and the computer chose " + computer + ". Scissors cuts paper.");
        }
        if((user.equals("paper") && computer.equals("rock")) || (user.equals("rock") && computer.equals("paper")))
        {
            System.out.println("You chose " + user + " and the computer chose " + computer + ". Paper wraps rock.");
        }
        if(user.equals(computer) || computer.equals(user))
        {
            System.out.println("You chose " + user + " and the computer chose " + computer + ". Tie. The game must be played again to determine the winner.");
        }
    }
    //Clifton Williams
    //CS1400
    //Project 1 Lab 3
}
