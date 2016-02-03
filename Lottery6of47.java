import java.util.Arrays;

public class Lottery6of47 {

	public static void main(String[] args) {
		final int TOTAL_NUMBERS = 47;
		final int RESULTING_NUMBERS = 6;
		
		int[] numbers = new int[TOTAL_NUMBERS];
		for ( int i = 0; i < TOTAL_NUMBERS; i++ ) {
			numbers[i] = i + 1;
		}
		
		int[] result = new int[RESULTING_NUMBERS];
		int numbersIndex;
		for ( int i = 0, n = TOTAL_NUMBERS; i < RESULTING_NUMBERS; i++, n-- ) {
			numbersIndex = (int) (Math.random() * n);
			result[i] = numbers[numbersIndex];
			numbers[numbersIndex] = numbers[n-1];
		}
		
		System.out.println("Winning combination is: " + Arrays.toString(result));
	}

}
