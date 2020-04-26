package finalProj;

import java.util.*;
import java.io.*;

public class WriteQFiles {
	
	public WriteQFiles(ReadQFiles Q) {// Need to be passed original readQFiles
		
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
			
			// Updating cont
			System.out.println("Do you want to continue? (Y/N)");
			String contText = keyboard.next();
			
			if((contText.toLowerCase().equals("n"))){
				cont = false;
			}
		}
		
		// Writing the questions to a file
		try {
		writeQuizFile(Q.getQuizzes());
		writeQuestionFile(questions, quizName);
		}
		catch (IOException ex){
			System.out.println("File unable to be made");
		}
		
		System.out.println("Quiz Made!");
	}
	
	private void writeQuizFile(ArrayList<String> quizzes) throws IOException{
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Quizzes.txt"));
		
		// For loop to go through quizzes ArrayList
		for(String index: quizzes) {
			// Taking String at that array
			String quiz = index;
			
			// Writing to File
			bw.write(quiz);
		}
		bw.close();
	}
	
	private void writeQuestionFile(ArrayList<Question> questions, String quizName) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(quizName + ".txt"));
		
		// For each loop to go through questions
		for(Question index: questions) {
			// Retrieving information from question object
			String questionText = index.getQuestion();
			String answer = index.getAnswer();
			
			// Writing to file
			String output = questionText + "," + answer;
			bw.write(output);
		}
		bw.close();
	}
}
