package finalProj;

import java.util.*;

public class WriteQuestionFiles {
	
	public WriteQuestionFiles(){
		
		// Access to keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Retrieve information from user
		System.out.println("Please Enter Quiz Name:");
		String quizName = keyboard.nextLine();
		
		// Variables used to keep adding questions 
		boolean cont = true;
		
		// ArrayList of Question to write to file
		ArrayList<Question> questions = new ArrayList<Question>();
		
		// While loop used to keep asking questions
		while(cont)
		{
			// Retrieve information from user
			System.out.println("Please Enter Question:");
			String question = keyboard.nextLine();
			System.out.println("Please Enter Answer:" );
			String answer = keyboard.nextLine();
			System.out.println();
			
			// Making a object for question and answers
			Question questionAnswer = new Question(question, answer);
			
			// Adding it to arrayList Questions
			questions.add(questionAnswer);
		}
		
		// Writing the questions to a file
		writeToFile(questions);
	}
	
	private void writeToFile(ArrayList<Question> questions){
		
	}
}
