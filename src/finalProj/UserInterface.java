package finalProj;
import java.util.Scanner;
import java.io.*;
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
		
		WelcomeMessage welcome = new WelcomeMessage();
		welcome.welcomeMessage2();
		welcome.setVisible(true);
		
		
		
	//	UsernameInput x = new UsernameInput();
	//	x.setVisible(true);
		
	//	System.out.println("Welcome to the Platinum Trivia App!");
	//	System.out.println("Please enter your username as one String, type 'guest' if you are a guest: ");
	//	String username = input.nextLine();
	}
	
	public static void processname(String username) throws IOException {
		UserInterface user = new UserInterface();

			Scanner input = new Scanner(System.in);

		Guestinformation currentUser; 
		
		if (username.equalsIgnoreCase("guest")) {
			 currentUser = new Guestinformation(username);

		}
		else {
			 currentUser = new Profileinformation(username);

		}
		
		File checkRecordExists = new File(username+"record"+".txt");
		if (checkRecordExists.exists()&& !username.equalsIgnoreCase("guest") ) {
			currentUser.readUserRecord();

		}
		
		
		File checkUserExists = new File(username+".txt");
		if (checkUserExists.exists()&& !username.equalsIgnoreCase("guest")) {
		System.out.println("Welcome Back!" +" would you like to see a list of the questions that you answered in previou sessions? y/n");
		if(input.nextLine().equalsIgnoreCase("y")){
			currentUser.PreviousProgress();
		}
		}
				
		QuizStopwatch timer = new QuizStopwatch();
		timer.QuizReset();

		timer.QuizStart();
		
		System.out.println("Would you like to write your own questions or use an existing quiz?");
		System.out.println("Type New/Old");
		if(input.nextLine().equalsIgnoreCase("New")){
			ReadQFiles newQ = new ReadQFiles();
			WriteQFiles newQuiz = new WriteQFiles(newQ.getQuizzes());
			System.out.println("Would you like to take a quiz now? y/n ");
			if(input.nextLine().equalsIgnoreCase("n")){
				System.exit(0);
			}
		}
		int score = 0;
		ReadQFiles quizzes = new ReadQFiles();
		System.out.println(quizzes.getQuizzes());
		System.out.println("Please type the name of your quiz: ");
		quizzes.readQuestionFile(input.nextLine());
		System.out.println("Type 'STOP' to end ");
		Queue<Integer> q = user.randomQueue(quizzes);
		System.out.println(quizzes.getQuestions().get(q.element()).getQuestion());
		boolean cont = true;
		int index = 0;
		while(cont){
			String[] answer = input.nextLine().split(" ");
			if (answer[0].equalsIgnoreCase("stop")){
				cont = false;
			}
			else {
			index++;
			score = user.checkAnswer(answer, quizzes, quizzes.getQuestions().get(q.element()), score);
			q.remove();
			String NewQuestion;
			if(q.peek()!=null){
				NewQuestion = quizzes.getQuestions().get(q.element()).getQuestion();
			} else {
				break;
			}
			currentUser.UserProgress(NewQuestion);
			System.out.println(NewQuestion);
			}
			if (index == quizzes.getQuestions().size()){
				String[] answer2 = input.nextLine().split(" ");
				if (answer2[0].equalsIgnoreCase("stop")){
					cont = false;
				}
				else {
				index++;
				score = user.checkAnswer(answer, quizzes, quizzes.getQuestions().get(q.element()), score);
				}
			}
		} System.out.println("Hope you had fun! Your score for this session was " + score);
		
		timer.QuizEnd();

		currentUser.record(score, timer.QuizTime()); 
		System.exit(0);

	}
	public Queue<Integer> randomQueue(ReadQFiles quizzes) throws FileNotFoundException{
		/* Creates a queue of numbers put in a random order based on the quiz length.
		* @author William
		* You don't have to worry about repeat questions with these.
		*/
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

	public int checkAnswer(String[] answer, ReadQFiles quizzes, Question currentQ, int score) throws IOException{
		for(int i = 0; i < answer.length; i++){
			for(int j = 0; j < currentQ.getAnswerList().size(); j++){
				if(answer[i].toLowerCase().equals(currentQ.getAnswerList().get(j).toLowerCase())){
					score += 1;
					System.out.println("That's right! The correct answer was " + currentQ.getAnswer());
					return score;
				}
			} System.out.println("Sorry, the right answer was " + currentQ.getAnswer());
		}
		return score;
	}	
	
	
	
	
}
