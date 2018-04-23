
public class MainNotes {

	public static void main(String[] args) {
		int newScore = calculateScore("Tim", 500);
		System.out.println("New score is " + newScore);
		
		calculateScore("Jeannie",100);
		calculateScore(75);
		calculateScore();
	}

	//Method to display how much points a player scored
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
		
	}
	
	//Method to display how many points an unnamed player scored
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points.");
		return score * 1000;
	}
	
	//Method
	public static int calculateScore() {
		System.out.println("No player name, no player score.");
		return 0;
	}
}
