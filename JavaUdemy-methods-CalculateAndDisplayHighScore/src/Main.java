/* We will be calculating and displaying final scores. We will also be calculating and displaying high score positions.
 * 
 *
 */

public class Main {
	
	public static void main(String[] args) {
		
		int highScore = calculateScore(true, 800, 5, 100);
		System.out.println("Your final score was " + highScore);
		
		highScore = calculateScore (true, 10000, 8, 200);
		System.out.println("Your final score was " + highScore);
		
		// Will display someone's name and will tell us what position they received on the high score table
		int score;
		score = 1500;
		displayHighScorePosition("Jeannie", calculateHighScorePosition(score));
		score = 1000;
		displayHighScorePosition("Joshua", calculateHighScorePosition(score));
		score = 900;
		displayHighScorePosition("Jacob", calculateHighScorePosition(score));
		score = 500;
		displayHighScorePosition("Wesley", calculateHighScorePosition(score));
		score = 400;
		displayHighScorePosition("Paige", calculateHighScorePosition(score));
		score = 100;
		displayHighScorePosition("Karla", calculateHighScorePosition(score));
		score = 50;
		displayHighScorePosition("Eryn", calculateHighScorePosition(score));
		
	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore +=2000;
			
			return finalScore;
		}
		
		return -1;
	}
	
	//Create a method called displayHighScorePosition
	//Method takes in players name & position in the high score table
	public static void displayHighScorePosition(String playersName, int playerScore) {
		
		//display the players name along with message "managed to get into position" + finalScore "on the high score table"
		System.out.println(playersName + " managed to get into position " + playerScore + " on the high score table!");
		
	}
	
	//Create method called calculateHighScorePosition
	//One argument only, the player score
	/*If playerScore >=1000 return 1
	If playerScore >= 500 && playerScore <1000 return 2
	If playerScore >=100 && playerScore<500 return 3
	Else, return 4
	*/
	
	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		}
		
		if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		}
		
		if (playerScore >= 100 && playerScore < 500) {
			return 3;
			
		}
		
		else {
			return 4;
			
		}
	}
	
	
}
