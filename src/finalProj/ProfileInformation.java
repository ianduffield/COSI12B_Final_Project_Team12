package finalProj;
import java.io.*;

/**
 * Find user's profile and retrieves information from their file
 * @author Ghazal
 *
 */

// I believe that we wanted to be able to keep track of a users information
public class ProfileInformation{
	private String username;
 	private Question question;
 	
 	
 	public void ProfileInformation (String user, Question question){
		this.username = user;
		this.question = question;
		
	}
	public void Fileread() throws IOException{
		String username = this.username+".txt";
		File file = new File (username);
		FileWriter write = new FileWriter(file);
		PrintWriter input = new PrintWriter(write);

		
	input.print(this.question.getID());
		input.print("       ");
	input.close();

	}
	
	//guest to not save...
	//returning users. 
	
	
	
}
