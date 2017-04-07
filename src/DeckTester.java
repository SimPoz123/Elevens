/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = new String[3];
		ranks[0] = "A";
		ranks[1] = "B";
		ranks[2] = "C";

		String[] suits = new String[2];
		suits[0] = "Giraffes";
		suits[1] = "Lions";

		int[] values = new int[3];
		values[0] = 2;
		values[1] = 1;
		values[2] = 6;

		String[] emptyStrings = new String[0];
		int[] emptyInts = new int[0];

		Deck deck = new Deck(ranks, suits, values);
		System.out.println(deck);
		System.out.println(deck.size());

		Deck deck2 = new Deck(emptyStrings, emptyStrings, emptyInts);
		if (deck2.isEmpty()) {
			System.out.println("Deck 2 is empty");
		}

		System.out.println((deck.deal()).toString());
	}
}
