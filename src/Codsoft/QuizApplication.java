package Codsoft;



//	********** QUIZ APPLICATION WITH TIMER *************



import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class QuizApplication {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Quiz Application!");
		System.out.println("Rules: You have 10 seconds to answer each question.Enter the option number (1-4) as your choice,");
		System.out.println("Good luck!\n");
		
		String[] questions = {"What is the size of an int in java?",
				"What is the default value of a boolean variable in java?",
				"Which operator is used to compare two values in java?",
				"What is the purpose of the try block in java?",
				"Which class is used to read input from the user in java?"
		};
		
		String[][] options = {
				{"1.16 bits","2.32 bits","3.64 bits","4.128 bits"},
				{"1.false","2.true","3.0","4.null"},
				{"1.=","2.===","3.==","4.!="},
				{"1.To execute code always","2.To catch exceptions","3.To handle resources","4.To run code conditionally"},
				{"1.System","2.scanner","3.Scanner","4.InputStream"},
		};
		
		int[] answers = {2,1,3,2,3};
		int score = 0;
		
		for(int i=0;i<questions.length;i++) {
			System.out.println("Questions"+(i+1)+": "+questions[i]);
			for(String option : options[i]) {
				System.out.println(option);
			}
			
			System.out.print("You have 10 seconds to answer.Enter your choice(1-4):");
			long startTime = System.currentTimeMillis();
			int userAnswer = -1;
			
			while
				((System.currentTimeMillis()-startTime) < 10000) {
				if(sc.hasNextInt()) {
					userAnswer = sc.nextInt();
					if(userAnswer >= 1 && userAnswer <=4) {
						break;
					}else {
						System.out.println("Invalid choice! please enter a number between 1 and 4.");
						userAnswer = -1;
					}
				}
			}
			
			if(userAnswer == -1) {
				System.out.println("\n Time's up! The correct answer was "+options[i][answers[i]-1]);
			}else if(userAnswer == answers[i]) {
				System.out.println("Correct!");
				score++;
			}else {
				System.out.println("Incorrect! The correct answer was "+options[i][answers[i]-1]);
			}
			System.out.println();
		}
		
		System.out.println("Quiz Over!");
		System.out.println("Your final score: "+score+"/"+questions.length);
		
		System.out.println("Thank you for playing!");
		

	}

}
