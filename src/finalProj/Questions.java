package finalProj;
/**
 * Keeps all questions together in an arrayList
 * @author ericw
 *
 */
public interface Questions {
	/*
	 * The question asked
	 */
	public String setQuestionText();
	
	/*
	 * The answer to the question
	 */
	public String setCorrectAnswer();
	
	// Depends on what we do, but we might want to implement multiple choice questions
	// and have other incorrect answers stored with the question.
}
