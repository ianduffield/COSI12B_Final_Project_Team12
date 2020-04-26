package finalProj;
import java.io.FileNotFoundException;
import java.io.IOException;
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
	
	public static void main(String[] args) throws IOException{
		UserInterface user = new UserInterface();
		System.out.println("Welcome to the Platinum Trivia App!");
		System.out.println("Please enter your username as one String, type 'guest' if you are a guest: ");
		Scanner input = new Scanner(System.in);
		String username = input.nextLine();
		ProfileInformation currentUser = new ProfileInformation(username);
		int score = 0;
		ReadQFiles quizzes = new ReadQFiles();
		Queue<Integer> q = user.randomQueue(quizzes);
		System.out.println(quizzes.getQuestions().get(q.element()).getQuestion());
		boolean cont = true;
		while(cont){
			String[] answer = input.nextLine().split(" ");
			if (answer[0].equalsIgnoreCase("stop")){
				cont = false;
			} else {
			score = user.checkAnswer(answer, currentUser, quizzes, quizzes.getQuestions().get(q.element()), score);
			q.remove();
			System.out.println(quizzes.getQuestions().get(q.element()).getQuestion());
			}
		} System.out.println("Hope you had fun! Your score for this session was " + score);
		currentUser.Score(score);
	} 
	public Queue<Integer> randomQueue(ReadQFiles quizzes) throws FileNotFoundException{
		// Creates a queue of numbers put in a random order based on the quiz length.
		// You don't have to worry about repeat questions with these. 
		 Queue<Integer> q = new LinkedList<>();
		 int quizSize = quizzes.getQuestions().size(); //This is meant to be the number of questions in the quiz.
		 int[] questionList = new int[quizSize];
		 //Above two lines don't work, please replace "questions.size" to appropriate variable.
		 for (int quest = 0; quest < quizSize ; quest++) {
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
		 for (int question = 0; question < quizSize ; question++) {
			 q.add(questionList[question]);
		 } return q;
		 //q.pop() can be used to remove a question that is already done.
 	// The interface uses this method to call and generate a new question using the current queue number available. 
	}
	
	public int checkAnswer(String[] answer, ProfileInformation currentUser, ReadQFiles quizzes, Question currentQ, int score) throws IOException{
		for(int i = 0; i < answer.length; i++){
			for(int j = 0; j < currentQ.getAnswerList().size(); j++){
				if(answer[i].toLowerCase().equals(currentQ.getAnswerList().get(j).toLowerCase())){
					score += 1;
					System.out.println("That's right! The correct answer was " + currentQ.getAnswer());
					currentUser.UserProgress(currentQ.id);
					return score;
				}
			} System.out.println("Sorry, the right answer was " + currentQ.getAnswer());
		} currentUser.UserProgress(currentQ.id);
		return score;
	}
}
