package Codsoft;



//         ************* NUMBER GAME ******************
	


import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        Random random = new Random();

	        int min = 1,max = 100;
	        int attempts = 5;
	        boolean playAgain;

	        do{
	            int numberToGuess = random.nextInt(max-min+1)+min;
	            int attemptsLeft = attempts;
	            boolean guessedCorrectly = false;

	            System.out.println("Guess a number between "+ min +" and "+max+"!");

	            while(attemptsLeft > 0){
	                System.out.print("Enter your guess: ");
	                int userGuess = sc.nextInt();
	                attemptsLeft--;

	                if(userGuess == numberToGuess){
	                    System.out.println("Congratulations! You guessed the correct number.");
	                    guessedCorrectly = true;
	                    break;
	                }else if(userGuess < numberToGuess){
	                    System.out.println("Too low! Attempts left:" + attemptsLeft);
	                }else{
	                    System.out.println("Too high! Attempts left: " + attemptsLeft);
	                }
	                }

	                if(!guessedCorrectly){
	                    System.out.println("You've run out of attempts. The correct number was:" + numberToGuess);
	                }

	                System.out.print("Do you want to play again?(yes/no):");
	                playAgain = sc.next().equalsIgnoreCase("yes");
	         }while(playAgain);

	            System.out.println("Thanks for playing!");

	}

}
