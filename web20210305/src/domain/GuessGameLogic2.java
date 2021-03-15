package domain;

public class GuessGameLogic2 {
	private int theNumber;
	private int remainder = 5;
    String hint;
	public String getHint() {
		return hint;
	}

	public GuessGameLogic2(int startNumber, int endNumber) {
		this.theNumber = generateRandomNumber(startNumber, endNumber);
	}

	public GuessGameLogic2(int startNumber, int endNumber, int remainder) {
		this.remainder = remainder;
		this.theNumber = generateRandomNumber(startNumber, endNumber);
	}

	public boolean isCorrectGuess(int guess) {
		if (guess == theNumber) {
			return true;
		} else {
			if(guess >theNumber)
				hint="Your Guess Number too big";
			else
				hint="Your Guess Number too small";
			remainder--;
			return false;
		}
	}

	private int generateRandomNumber(int startNumber, int endNumber) {
		double range = (double) (endNumber - startNumber + 1);
		return startNumber + (int) (Math.random() * range);
	}

	public int getRemainder() {
		return remainder;
	}
}
