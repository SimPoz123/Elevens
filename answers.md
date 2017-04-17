#Questions

1. In both Elevens and Thirteens, the size method solves for the length of the cards array. Although the length of each cards array is different, the length method can be used to find the value in both cases.

2. Cards are replaces in the same way no matter what the game. When a card is being replaced, no matter the game, the card is replaced with the top card of the deck, or, if the deck is empty, null. This does not change depending upon the game, so therefore the method does not need to be abstract.

3. Yes, it would be able to call the methods polymorphically, because it would be able to call the methods and then use its own values and methods, or even version of the methods, successfully. However, it does not work as well as the abstract class design, because there were more values and characteristics that belonged to the `Board` superclass, such as the cards array and the deck.
