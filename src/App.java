import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Player playerX = new ManualPlayer();
		Player playerO;

		System.out.println("Choose game mode.");
		System.out.println("Press 1 for 1-player game and 2 for 2-player game:");

		int gameMode;

		while (true) {
			gameMode = scanner.nextInt();

			if (gameMode == 1) {
				playerO = new ComputerPlayer();
				break;
			} else if (gameMode == 2) {
				playerO = new ManualPlayer();
				break;
			} else {
				System.out.println("Incorrect input. Please try again:");
			}
		}

		System.out.println("Let's start the game!");

		while (true) {
			playerX.move(FieldValues.CROSS);
			Player.field.showField();
			
			if (Player.field.hasSomeoneWon(FieldValues.CROSS)) {
				System.out.println("Player X won!");
				break;
			}

			if (Player.field.isFull()) {
				System.out.println("It's a draw!");
				break;
			}

			playerO.move(FieldValues.NAUGHT);
			Player.field.showField();
			
			if (Player.field.hasSomeoneWon(FieldValues.NAUGHT)) {
				System.out.println("Player O won!");
				break;
			}
		}

		scanner.close();
	}

}
