package finalProj;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Find user's profile and retrieves information from their file
 * @author Ghazal
 *
 */
//guest to not save...
	//returning users. 
// I believe that we wanted to be able to keep track of a users information
public class ProfileInformation{
	protected String username;
 	
 	
 	public ProfileInformation (String user){
		this.username = user;
		
	}
 
	
 	
 	public void newUserFile() throws IOException{
 		//This method is called when a user is a first time user
		String username = this.username+".txt";
		File file = new File (username);
	

	}
 	
 	
 	
 	
	public void UserProgress(int QID) throws IOException {
 		
 		String username = this.username+".txt";
		File file = new File (username);
		FileWriter write = new FileWriter(file, true);
		PrintWriter input = new PrintWriter(write);

		
	input.print(QID);
		input.print("       ");
	input.close();
 	}
 		
 	
 	
 	
	public void Score(int score) throws IOException {
		String username = this.username+"Score"+".txt";
		File file = new File (username);
		FileWriter write = new FileWriter(file);
		PrintWriter input = new PrintWriter(write);

		
	input.print(score);
	input.close();
		
 		
 	}
 	
 
	public void PreviousScore() throws IOException {
		String username = this.username+"Score"+".txt";
		try (Scanner read = new Scanner (new File (username))) {
			while (read.hasNext()){
				int QID = read.nextInt();
		
 		
 	}
		}
	
		}
 	
	
 	public void readUserQID() throws FileNotFoundException {
		String username = this.username+".txt";
 		try (Scanner read = new Scanner (new File (username))) {
			while (read.hasNext()){
				int QID = read.nextInt(); //how you want to use this? also how were user answers stored again?
				
				
			}
		}
 		
 	}
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	/*
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
	
	
}


 	public void GuestUserFile() throws IOException{
 		//This method is called when a user is a first time user
		String username = "Guest.txt";
		File file = new File (username);


	}
 	

 	
	public void GuestUserProgress() throws IOException{
 		String username = "Guest.txt";
		File file = new File (username);
		FileWriter write = new FileWriter(file, true);
		PrintWriter input = new PrintWriter(write);

			
	input.print(this.question.getID());
		input.print("       ");
	input.close();
	

	}
 	


 	*/
}
