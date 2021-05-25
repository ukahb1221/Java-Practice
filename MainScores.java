//Brian Ukah
import java.util.Scanner;

public class MainScores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number 1-100 (negative numbers will end the program): ");

		int[] scores = new int[100]; // array for scores
		int userNum; // holds userInput
		int average; // holds the average number of the total scores
		int numberOfScores; // holds the amount of scores
		numberOfScores = average = 0;

		// loop through to add inputs to the array
		for (int i = 0; i < 100; i++) {
			userNum = input.nextInt();
			if (userNum < 0)
				break;
			scores[i] = userNum;
			average += userNum;
			numberOfScores++;
		}

		average /= numberOfScores;

		int aboveOrEqualAverage; // stores inputs above the average
		int belowAverage; // stores variables below the average
		aboveOrEqualAverage = belowAverage = 0;

		// loop through and add to appropriate variables
		for (int i = 0; i < numberOfScores; i++) {
			if (scores[i] >= average) 
				aboveOrEqualAverage++;
			else
				belowAverage++;
			
		}
		System.out.println("\nAverage of scores: " + average);
		System.out.println(
			"Number of scores above or equal to average: " + aboveOrEqualAverage);
		System.out.println(
			"Number of scores below average: " + belowAverage);
		input.close();
	}

}
