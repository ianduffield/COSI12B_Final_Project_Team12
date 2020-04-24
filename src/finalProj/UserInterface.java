package finalProj;
import java.util.Scanner;
/**
 *Constructor for ProfileInformation needs to have username, a String username is passed
 *
 * Information is displayed and retrieved from user
 * 
 *
 * @author ianduffield
 *
 */
public class UserInterface{

	public static void main(String[] args) {
		System.out.println("Welcome to the Platinum Trivia App!");
		System.out.println("Please enter your username as one String: ");
		Scanner input = new Scanner(System.in);
		String username = input.nextLine();
		ProfileInformation currentUser = new ProfileInformation(username);
		while(!input.nextLine().equals("STOP")){
			currentUser.getQuestion();
			String[] answer = input.nextLine().split(" ");
			int prevScore = currentUser.getCorrect();
			for(int i = 0; i < answer.length; i++){
				for(int j = 0; j < currentUser.getAnswer().length; j++){
					if(answer[i].toLowerCase().equals(currentUser.getAnswer(j))){
						currentUser.setCorrect(1);
						System.out.println("That's right! The correct answer was " + currentUser.getAnswer());
						break;
					}
				}
			} if (prevScore != currentUser.getCorrect()){
				System.out.println("Sorry, the right answer was " + currentUser.getAnswer());
			}
		}
	}

}
