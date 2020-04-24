package finalProj;

/**
 * Keeps all questions together in an arrayList
 * @author ericw
 * Make sure answer is the array of strings
 */
public class Question {
	
		String question;
		String answer;
		
		public Question(String question, String answer) {
			this.question = question;
			this.answer = answer;
		}
		/*
		 * The question asked
		 */
		public String getQuestion();
		
		/*
		 * The answer to the question
		 */
		public String getAnswer();
		
		public String[] getAnswerArray();
		
		public void setQuestion(String question) {
			this.question = question;
		}
		
		public void setAnswer(String Answer) {
			this.answer = answer;
		}
		// Depends on what we do, but we might want to implement multiple choice questions
		// and have other incorrect answers stored with the question.
}
