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
	private Questions question;
	
	
	public void ProfileInformation (String username, Questions question){
		this.username = username;
		this.question = question;
		
	}
	public static void main (String[] args) throws IOException{
		String username = "hi"+".txt";
		File file = new File ("hi.txt");
		FileWriter write = new FileWriter(file);
		PrintWriter input = new PrintWriter(write);
		
		input.println("TEST TEST");
		input.println("TEST2 TEST2");
		input.close();

	}
	
	
}
