package finalProj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Retrieve questions and answers from file and adds them to questions
 * 
 * @author Eric
 * Make sure to have answer as array of strings
 */
public class ReadQFiles {
	
	ArrayList<Question> questions = new ArrayList<Question>();
	
	ArrayList<String> quizzes = new ArrayList<String>();
	
	// Used to read quiz file
	public ReadQFiles() throws FileNotFoundException{
		// Opening Quizzes File
		Scanner scan = new Scanner(new File("Quizzes.txt"));
		
		// While loop to scan through file
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			
			// Adding lines to quizzes ArrayList
			quizzes.add(line);
		}
	}
	
	/**
	 * Method used to find a specific file of questions
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	public void readQuestionFile(String fileName) throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File(fileName + ".txt"));
		
		// Index used for the ID of the question
		int index = 0;
		
		// While loop used for while file has a next line
		while(scan.hasNextLine()) {
			
			// Makes a string of the next line
			String line = scan.nextLine();
			
			// Setting values to numbers
			// Index 0: Question Index 1: Answer
			String[] questionAnswer = line.split(",");
			
			// Creating new Question object
			Question currentQuestion = new Question(questionAnswer[0], questionAnswer[1], index);
			
			// Adding Question object to ArrayList of questions
			questions.add(currentQuestion);
			
			index++;
			
			// Code used for testing
			//System.out.println("Question: " + questionAnswer[0]);
			//System.out.println("Answer: " + questionAnswer[1]);
			//System.out.println();
		}
	}
	
	public ArrayList<Question> getQuestions(){
		return questions;
	}
	
	public ArrayList<String> getQuizzes(){
		return quizzes;
	}
}
