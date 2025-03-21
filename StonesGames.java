import java.util.Scanner;

public class StonesGames {
	public static void main(String[] args) {
		System.out.println("How many stones do you want to play with?");
		System.out.print("Type the number here: ");
		int chosenNumber, stonesAvailable;
		stonesAvailable = 0;
		Scanner keyboard = new Scanner(System.in);
		chosenNumber = keyboard.nextInt();
		System.out.println("       ");

		/*
		 * This loop is to ensure players enter an odd and positive numbers of stones to
		 * start with.
		 */

		while (stonesAvailable == 0) {
			if (chosenNumber == 0) {
				System.out.println("Consider entering a number bigger than 0.");
				System.out.println("What is the new number of stones you want to play with?");
				System.out.print("Type the new number here: ");
				chosenNumber = keyboard.nextInt();
				System.out.println("       ");
			} else if (chosenNumber < 0 && chosenNumber % 2 != 0) {
				System.out.println("Consider entering a positive odd number.");
				System.out.println("What is the new number of stones you want to play with?");
				System.out.print("Type the new number here: ");
				chosenNumber = keyboard.nextInt();
				System.out.println("       ");
			} else if (chosenNumber > 0 && chosenNumber % 2 == 0) {
				System.out.println("Consider entering an odd number.");
				System.out.println("What is the new number of stones you want to play with?");
				System.out.print("Type the new number here: ");
				chosenNumber = keyboard.nextInt();
				System.out.println("       ");
			} else if (chosenNumber < 0 && chosenNumber % 2 == 0) {
				System.out.println("Consider entering a positive number.");
				System.out.println("What is the new number of stones you want to play with?");
				System.out.print("Type the new number here: ");
				chosenNumber = keyboard.nextInt();
				System.out.println("       ");
			} else if (chosenNumber == 1) {
				System.out.println("You cannot start a game with only 1 stone.");
				System.out.println("What is the new number of stones you want to play with?");
				System.out.print("Type the new number here: ");
				chosenNumber = keyboard.nextInt();
				System.out.println("       ");
			} else {
				stonesAvailable = chosenNumber;
			}
		}

		/* At this point the program asks the two players to enter their names. */

		String firstPlayer, secondPlayer;
		System.out.println("We now need to register the two players.");
		System.out.print("The first player: ");
		Scanner keyboard1 = new Scanner(System.in);
		firstPlayer = keyboard1.next();
		System.out.print("The second player: ");
		secondPlayer = keyboard1.next();
		System.out.println("       ");

		int firstRange, firstPlay, secondPlay, firstPlayerStones, secondPlayerStones;
		firstPlayerStones = 0;
		secondPlayerStones = 0;
		secondPlay = 0;
		firstRange = stonesAvailable / 2;

		System.out.println("There are " + stonesAvailable + " stones in the pile.");
		System.out.println(firstPlayer + " has " + firstPlayerStones + " stones.");
		System.out.println(secondPlayer + " has " + secondPlayerStones + " stones.");
		System.out.println("       ");

		System.out.println(firstPlayer + ", choose between 1 and " + firstRange + ".");
		System.out.print("Type the number here: ");
		Scanner keyboard2 = new Scanner(System.in);
		firstPlay = keyboard2.nextInt();
		System.out.println("       ");

		/*
		 * This loop is to ensure the first player picks no more than the half of the
		 * initial number of stones.
		 */

		while (firstPlayerStones == 0) {
			if (firstPlay == 0) {
				System.out.println("You cannot start the game with " + firstPlay + " stones.");
				System.out.println("       ");
				System.out.println(firstPlayer + ", choose between 1 and " + firstRange + ".");
				System.out.print("Type the new number here: ");
				firstPlay = keyboard2.nextInt();
				System.out.println("       ");
			} else if (firstPlay > firstRange) {
				System.out.println("You cannot start the game with more than " + firstRange + " stones.");
				System.out.println("       ");
				System.out.println(firstPlayer + ", choose between 1 and " + firstRange + ".");
				System.out.print("Type the new number here: ");
				firstPlay = keyboard2.nextInt();
				System.out.println("       ");
			} else {
				stonesAvailable -= firstPlay;
				firstPlayerStones += firstPlay;
			}

		}
		System.out.println("There are " + stonesAvailable + " stones in the pile.");
		System.out.println(firstPlayer + " has " + firstPlayerStones + " stones.");
		System.out.println(secondPlayer + " has " + secondPlayerStones + " stones.");
		System.out.println("       ");

		/*
		 * The variable 'checker' is introduced to help call each player when it is
		 * their turn to play.
		 */

		int checker;
		checker = 1;

		while (stonesAvailable > 0 && checker > 0) {
			if (checker % 2 != 0) {
				if (firstPlay * 2 > stonesAvailable) {
					System.out.println(secondPlayer + ", choose between 1 and " + stonesAvailable + " stones.");
					System.out.print("Type the number here: ");
					secondPlay = keyboard2.nextInt();
					System.out.println("       ");

					while (secondPlay > stonesAvailable) {
						System.out.println("There are only " + stonesAvailable + " stones left in the pile.");
						System.out.println(secondPlayer + ", choose between 1 and " + stonesAvailable + " stones.");
						System.out.print("Type the new number here: ");
						secondPlay = keyboard2.nextInt();
						System.out.println("       ");
					}
					stonesAvailable -= secondPlay;
					System.out.println("There are " + stonesAvailable + " stones in the pile.");
					secondPlayerStones += secondPlay;
					System.out.println(firstPlayer + " has " + firstPlayerStones + " stones.");
					System.out.println(secondPlayer + " has " + secondPlayerStones + " stones.");
					checker += 1;
					System.out.println("       ");

				} else {
					System.out.println(secondPlayer + ", choose between 1 and " + firstPlay * 2 + " stones.");
					System.out.print("Type the number here: ");
					secondPlay = keyboard2.nextInt();
					System.out.println("       ");

					while (secondPlay > firstPlay * 2) {
						System.out.println("You cannot take more than " + firstPlay * 2 + " stones.");
						System.out.println(secondPlayer + ", choose between 1 and " + firstPlay * 2 + " stones.");
						System.out.print("Type the new number here: ");
						secondPlay = keyboard2.nextInt();
						System.out.println("       ");
					}
					stonesAvailable -= secondPlay;
					System.out.println("There are " + stonesAvailable + " stones in the pile.");
					secondPlayerStones += secondPlay;
					System.out.println(firstPlayer + " has " + firstPlayerStones + " stones.");
					System.out.println(secondPlayer + " has " + secondPlayerStones + " stones.");
					checker += 1;
					System.out.println("       ");

				}
			}

			else {
				if (secondPlay * 2 > stonesAvailable) {
					System.out.println(firstPlayer + ", choose between 1 and " + stonesAvailable + " stones.");
					System.out.print("Type the number here: ");
					firstPlay = keyboard2.nextInt();
					System.out.println("       ");

					while (firstPlay > stonesAvailable) {
						System.out.println("There are only " + stonesAvailable + " stones left in the pile.");
						System.out.println(firstPlayer + ", choose between 1 and " + stonesAvailable + " stones.");
						System.out.print("Type the new number here: ");
						firstPlay = keyboard2.nextInt();
						System.out.println("       ");
					}
					stonesAvailable -= firstPlay;
					System.out.println("There are " + stonesAvailable + " stones in the pile.");
					firstPlayerStones += firstPlay;
					System.out.println(firstPlayer + " has " + firstPlayerStones + " stones.");
					System.out.println(secondPlayer + " has " + secondPlayerStones + " stones.");
					checker += 1;
					System.out.println("       ");

				} else {
					System.out.println(firstPlayer + ", choose between 1 and " + secondPlay * 2 + " stones.");
					System.out.print("Type the number here: ");
					firstPlay = keyboard2.nextInt();
					System.out.println("       ");

					while (firstPlay > secondPlay * 2) {
						System.out.println("You cannot take more than " + secondPlay * 2 + " stones.");
						System.out.println(firstPlayer + ", choose between 1 and " + secondPlay * 2 + " stones.");
						System.out.print("Type the new number here: ");
						firstPlay = keyboard2.nextInt();
						System.out.println("       ");
					}
					stonesAvailable -= firstPlay;
					System.out.println("There are " + stonesAvailable + " stones in the pile.");
					firstPlayerStones += firstPlay;
					System.out.println(firstPlayer + " has " + firstPlayerStones + " stones.");
					System.out.println(secondPlayer + " has " + secondPlayerStones + " stones.");
					checker += 1;
					System.out.println("       ");

				}
			}
		}

		System.out.println("There are no more stones in the pile. The game is over.");
		System.out.println(firstPlayer + " has " + firstPlayerStones + " stones.");
		System.out.println(secondPlayer + " has " + secondPlayerStones + " stones.");
		System.out.println("       ");

		if (firstPlayerStones % 2 != 0) {
			System.out.println(firstPlayer + " wins with " + firstPlayerStones + " stones.");
			System.out.println("Congratulations " + firstPlayer);
			System.out.println("It was an amazing game!!!");
		} else {
			System.out.println(secondPlayer + " wins with " + secondPlayerStones + " stones.");
			System.out.println("Congratulations " + secondPlayer);
			System.out.println("It was an amazing game!!!");
		}
	}
}
