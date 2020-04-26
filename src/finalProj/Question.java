package finalProj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Keeps all questions together in an arrayList
 * @author Eric
 * Make sure answer is the array of strings
 */
public class Question {
	
		// Instance variables for the class
		String question;
		String answer;
		int id;
		
		// Secondary constructor for setting instance variables for writeQuestionFiles
		public Question(String question, String answer) {
			this.question = question;
			this.answer = answer;
		}
		
		// Secondary constructor and setting instance variables for ReadQuestionsFile
		public Question(String question, String answer, int id) {
			this.question = question;
			this.answer = answer;
			this.id = id;
		}
		/*
		 * Getter methods
		 */
		public String getQuestion() {
			return this.question;
		}
		
		public String getAnswer() {
			return this.answer;
		}
		
		public int getID() {
			return this.id;
		}
		
		/**
		 * Sending an arrayList for the delimeter in UserInterface?
		 * @return
		 */
		public ArrayList<String> getAnswerList() {
			// Scanning the answer
			Scanner answerScan = new Scanner(getAnswer()).useDelimiter(" ");
			
			// Creating an ArrayList to be sent to UserInterface?
			ArrayList<String> answerArray = new ArrayList<String>();
			
			// While loop for answerScan
			while(answerScan.hasNext()) {
				answerArray.add(answerScan.next());
			}
			
			return answerArray;
		}
		
		// Depends on what we do, but we might want to implement multiple choice questions
		// and have other incorrect answers stored with the question.
}
