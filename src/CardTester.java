/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("King", "Hearts", 13);
		Card card2 = new Card("9", "Spades", 9);
		Card card3 = new Card("A", "Diamonds", 1);

		test(card1);
		test(card2);
		test(card3);

		Card equalCard1 = new Card("King", "Hearts", 13);

		testEquality(card1, equalCard1);
	}

	public static void test(Card card) {
		System.out.println("Rank: " + card.rank());
		System.out.println("Suit: " + card.suit());
		System.out.println("Point Value: " + card.pointValue());

		System.out.println(card.toString());
	}

	public static void testEquality(Card a, Card b) {
		boolean equal = a.matches(b);
		if (equal) {
			System.out.println("The cards match");
		} else {
			System.out.println("The cards don't match");
		}

	}
}
