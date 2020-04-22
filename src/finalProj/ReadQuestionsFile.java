package finalProj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Retrieve questions and answers from file and adds them to questions
 * @author ericw
 *
 */
public class ReadQuestionsFile implements Questions{
	
	ArrayList<Questions> questions = new ArrayList<Questions>();
	
	/**
	 * If no questions are asked, refers to this method
	 * @throws FileNotFoundException
	 */
	public void readFile() throws FileNotFoundException {
		readFile("quiz.qs");
	}
	
	/**
	 * Method used to find a specific file of questions
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	public void readFile(String fileName) throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File(fileName + ".txt"));
		
		int questionNumber = 0;
		String question;
		String answer;
		
		// While loop used for while file has a next line
		while(scan.hasNextLine()) {
			String line = scan.nextLine(); // line is the entire line
			
			Scanner lineScan = new Scanner(line); // Scans the line
			
			// Setting values to numbers
			questionNumber = lineScan.nextInt();
			question = lineScan.next();
			answer = lineScan.next();
			
			questions.add()
		}
	}
	
	public void setQuestion() {
		
	}
	
	public void setAnswer() {
		
	}
	
	public String getQuestion() {
		
	}
	
	public String getCorrectAnswer() {
		
	}
}
