# Questions:

1.
The differences between the games include the amount of cards that are on the board at one time. In Elevens, there are only nine cards in play at one time, but in Thirteens there are 10 cards and in Tens there are 13 cards. Also, cards must add up to different numbers relating to the title of the game. In Elevens cards add up to 11, Thirteens is 13 and Tens is 10. Each game deals with face cards differently. In Thirteens, face cards are given point values of 11, 12 and 13 respectively, making a King the easiest card to remove. In Elevens, you have to remove a Jack, Queen and King all at the same time. In Tens you have to remove four face cards of the same rank all at once.

The games are all similar because there are cards on the board that add up to something. You win every game when the board and the deck are both empty. You lose if you cannot play.

2. The instance variables get initialized in the ElevensBoard by the same way they would be without a superclass. For example, the `cards` array is initialized first, and then given values in the constructor.

3. The abstract methods in `Board.java` are `anotherPlayIsPossible` and `isLegal`. These cover all the differences bwtween the three games because the main differences are how you remove cards. If there is another play possible or another move that is legal, you have to know the rules to that specific game. Everything else is the same.
