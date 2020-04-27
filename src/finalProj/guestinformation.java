package finalProj;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class guestinformation extends ProfileInformation {

	public guestinformation(String user) {
		super(user);
		// TODO Auto-generated constructor stub
	}
	
 	public void newUserFile() throws IOException{
 		//This method is called when a user is a first time user
		String username1 = username+".txt";
		File file = new File (username1);
	

	}
 	
	
	public void UserProgress(int QID) throws IOException {
 		
 		String username = this.username+".txt";
		File file = new File (username);
		FileWriter write = new FileWriter(file);
		PrintWriter input = new PrintWriter(write);

		
	input.print(QID);
		input.print("       ");
	input.close();
 	}
 		

}
