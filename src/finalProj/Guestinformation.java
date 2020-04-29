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
public class Guestinformation{
	protected String username;
 	
 	
 	public Guestinformation (String user){
		this.username = user;
		
	}
 
	
 	
 	public void newUserFile() throws IOException{
 		//This method is called when a user is a first time user
		String username = this.username+".txt";
		File file = new File (username);
	

	}
 	
 	
 	
 	
	public void UserProgress(String Q) throws IOException {
 		
 		String username = this.username+".txt";
		File file = new File (username);
		FileWriter write = new FileWriter(file);
		PrintWriter input = new PrintWriter(write);

		
	input.println(Q);
	input.close();
 	}
 		
 	
 	
 	
	public void record(int score, long time ) throws IOException {
		String username = this.username+"record"+".txt";
		File file = new File (username);
		FileWriter write = new FileWriter(file);
		PrintWriter input = new PrintWriter(write);

		
	input.print(score);input.print("    ");input.print(time);
	input.println();
	input.close();
		
 		
 	}
 	
 
	public void readUserRecord() throws IOException {
		String username = this.username+"record"+".txt";
		Scanner read = new Scanner (new File (username));
		int i = 1;
			while (read.hasNextLine()){
				Scanner read2 = new Scanner (read.nextLine());
				String Score = read2.next();
				String time = read2.next();
				System.out.println("Your score for session "+i+" was "+Score+" and you spent " + time + " minutes");
				i++;
		
 		
 	}
		}
	
		
 	
	
 	public void PreviousProgress() throws FileNotFoundException {
		String username = this.username+".txt";
 		try (Scanner read = new Scanner (new File (username))) {
			while (read.hasNextLine()){
				System.out.println();
				Scanner read2 = new Scanner (read.nextLine());
				while (read2.hasNext()) {
				System.out.print(read2.next()+" ");
				}
			}
			System.out.println();
			System.out.println();

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
