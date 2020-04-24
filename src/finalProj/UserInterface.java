package finalProj;
import java.util.Scanner;
import java.util.Random; 
import java.util.LinkedList;

/**
 *Constructor for ProfileInformation needs to have username, a String username is passed
 *
 * Information is displayed and retrieved from user
 * 
 *
 * @author ianduffield
 *
 */
public class UserInterface{
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Platinum Trivia App!");
		System.out.println("Please enter your username as one String: ");
		Scanner input = new Scanner(System.in);
		String username = input.nextLine();
		ProfileInformation currentUser = new ProfileInformation(username);
		currentUser.getQuestion();
		while(!input.nextLine().equals("STOP")){
			String[] answer = input.nextLine().split(" ");
			user.checkAnswer(answer);
		}
	}
	public Question randomQueue(){
		// Creates a queue of numbers put in a random order based on the quiz length.
		 Queue<Integer> q = new LinkedList<>();
		 int QuizLength = questions.size(); //This is meant to be the number of questions in the quiz.
		 for (int question; question < QuizLength ; question++) {
			 
		 }
 	// The interface uses this method to call and generate a new question using the current queue number available. 
	}
	
	public void checkAnswer(String[] answer){
		int prevScore = currentUser.getCorrect();
		for(int i = 0; i < answer.length; i++){
			for(int j = 0; j < currentUser.getAnswer().size(); j++){
				if(answer[i].toLowerCase().equals(currentUser.getAnswer().get(j))){
					currentUser.setCorrect(1);
					System.out.println("That's right! The correct answer was " + currentUser.getAnswer());
					break;
				}
			}
		} if (prevScore != currentUser.getCorrect()){
			System.out.println("Sorry, the right answer was " + currentUser.getAnswer());
		}
	}
}
