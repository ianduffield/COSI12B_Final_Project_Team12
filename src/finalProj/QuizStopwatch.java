package finalProj;
import java.time.Instant;
import java.time.Duration;

/**
 * Records how long a player takes to complete a quiz in minutes, as a "long", though not an int.
 * Can have the time be reset for subsequent quizzes.
 * @author William
 *
 */

public class QuizStopwatch {
	Instant start;
	Instant end;
	long timeTaken = 0;


	public void QuizStart() {
		// Uses the Instant class to record when a player started a quiz.
		start = Instant.now();
	}

	public void QuizEnd() {
		// Uses the Instant class to record when a player finished a quiz.
		end = Instant.now();
	}

	public long QuizTime() {
		// Uses the Duration class to find how much time was taken between the Start and End of a quiz.
		Duration elapsedTime = Duration.between(start, end);
		timeTaken = elapsedTime.toMinutes();
		return timeTaken;
		// Profile information should record this value for later just in case.
	}

	public void QuizReset() {
		//Resets the two values, for future quizzes.
		start = null;
		end = null;
	}


}
