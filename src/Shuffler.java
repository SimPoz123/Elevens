/**
 * This class provides a convenient way to test shuffling methods.
 */
import java.util.Random;

public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 3;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3, 4};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3, 4, 5};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Ten Flips:");
		for (int i = 0; i < 10; i++) {
			if (flip()) {
				System.out.println("Heads");
			} else {
				System.out.println("Tails");
			}
		}

		int[] values3 = {0, 1, 2, 3,};
		int[] values4 = {2, 1, 3, 0};
		int[] values5 = {2, 1, 5, 3};

		if (arePermuations(values3, values4)) {
			System.out.println("3 and 4 are permutations");
		}
		if (!(arePermuations(values3, values5))) {
			System.out.println("3 and 5 are not permutations");
		}
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];
		int k = 0;
		for (int i = 0; i <= (values.length + 1) / 2; i = i + 2) {
			shuffled[i] = values[i];
		}
		for (int i = (values.length + 1) / 2; i < values.length; i = i + 2) {
			shuffled[i] = values[i];
		}
		values = shuffled;
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		Random rand = new Random();
		for (int k = values.length - 1; k > 0; k = k - 1) {
			int r = rand.nextInt(k + 1);
			int temp = values[r];
			values[r] = values[k];
			values[k] = temp;
		}

	}

	public static boolean flip() {
		Random rand = new Random();
		int r = rand.nextInt(3);
		boolean heads;
		if (r == 2) {
			heads = false;
		} else {
			heads = true;
		}

		return heads;
	}

	public static boolean arePermuations(int[] a, int[] b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			boolean has = false;
			for (int j = 0; j < b.length; j++) {
				if (!(has)) {
					if (a[i] == b[j]) {
						has = true;
					}
				}
			}
			if (has) {
				count = count + 1;
			}
		}

		if (count == a.length) {
			return true;
		}

		return false;

	}
}
