package finalProj;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random; 
import java.util.List;
import java.util.Queue;

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
		// You don't have to worry about repeat questions with these. 
		 Queue<Integer> q = new LinkedList<>();
		 int[] questionList = new int[questions.size()];
		 int QuizLength = questions.size(); //This is meant to be the number of questions in the quiz.
		 //Above two lines don't work, please replace "questions.size" to appropriate variable.
		 for (int quest; quest < QuizLength ; quest++) {
			 questionList[quest] = quest;
		 }
		 Random rng = new Random();
		 // This loop is responsible for randomizing the order.	
			for (int i = 0; i < questionList.length; i++) {
				int randomIndex = rng.nextInt(questionList.length);
				int temp = questionList[randomIndex];
				questionList[randomIndex] = questionList[i];
				questionList[i] = temp;
			}
		 for (int question; question < QuizLength ; question++) {
			 q.add(questionList[question]);
		 }
		 //q.pop() can be used to remove a question that is already done.
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
