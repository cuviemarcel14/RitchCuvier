import java.util.Scanner;
import java.util.Arrays;

public class Cuvier_p3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] topics = { "Tech", "Food", "Games", "Love", "Money" };
		

		int people = 2;
		int total = 0;
		int[] topic1;
		int[][] answers = new int[5][people];
		for (int i = 0; i < people; i++) {
		for (int j = 0; j < topics.length; j++) 
		{
		System.out.println("What would you like to rate " + topics[j] + "? ");
		answers[j][i] = sc.nextInt();
			}
		System.out.printf("%15s", " ");
		for ( i = 0; i < people; i++) {
			System.out.printf("%10d", (i + 1));
		}
		System.out.println();
		double highest = Double.MIN_VALUE;
		double lowest = Double.MAX_VALUE;
		String highestTopic = null, lowestTopic = null;
		for (i = 0; i < topics.length; i++) {
			System.out.printf("%15s", topics[i]);
			double sum = 0.0;
			for (int j = 0; j < people; j++) {
				System.out.printf("%10d", answers[i][j]);
				sum += answers[i][j];
			}
			if (sum > highest) {
				highestTopic = topics[i];
				highest = sum;
			}
			if (sum < lowest) {
				lowestTopic = topics[i];
				lowest = sum;
			}
			double avg = sum / people;
			System.out.printf("%10f", avg);
			System.out.println();

		}
		System.out.printf("highest total: %s %f %n", highestTopic, highest);
		System.out.printf("lowest total: %s %f %n", lowestTopic, lowest);
		sc.close();
	}
	}
}