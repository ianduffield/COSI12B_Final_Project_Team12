package finalProj;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Profileinformation extends Guestinformation {

	public Profileinformation(String user) {
		super(user);
		// TODO Auto-generated constructor stub
	}
	
 	public void UserFile() throws IOException{
 		//This method is called when a user is a first time user
		String username1 = username+".txt";
		File file = new File (username1);
	

	}
 	
	
	public void UserProgress(String Q) throws IOException {
 		
 		String username = this.username+".txt";
		File file = new File (username);
		FileWriter write = new FileWriter(file, true);
		PrintWriter input = new PrintWriter(write);

		
	input.println(Q);
	input.close();
 	}
 		

	public void record(int score, long time ) throws IOException {
		String username = this.username+"record"+".txt";
		File file = new File (username);
		FileWriter write = new FileWriter(file,true);
		PrintWriter input = new PrintWriter(write);

		
	input.print(score);input.print("    ");input.print(time);
	input.println();
	input.close();
		
 		
 	}
 		

}
