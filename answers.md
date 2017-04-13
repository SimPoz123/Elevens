#Questions

1.
```
1. Cards on the table
2. Cards left in deck
```

2.
```
1. Deal nine cards onto the playing field
2. Check to see if there two cards add up to 11 or there is a J, Q and K.
3. Remove cards if available
4. Replace cards that were removed
5. If you cannot remove any cards, you lose
```

3. No, this file does not include all the state and behavior necessary to play the game. It has both a deck and a cards array that shows the card on the board. The file can deal cards, check to see if there is a play available, and replace cards. However, it cannot remove cards, as far as I can tell.

4.
a. `dealMycards` is used whenever a new game is being started, whether it is the initial game or simply a new game.
b. `anotherPlayIsPossible` should definitely call these methods, and so should `isLegal`
c.
```
 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
 0 | 1 | 3 | 6 | 7 |   |   |   |   |   |
```
d.
```
public static printCards(ElevenBoard board) {
  List<Integer> cIndexes = board.cardIndexes();

  for (int i = 0; i < cIndexes.length(); i++) {
    int index = cIndexes.get(i);
    cards[i].toString();
  }

}

```
e. `isLegal` requires `cardIndex` before it can be called, because it functions using a List as an input. `anotherPlayIsPossible` does not require it to be called, because it does not use a List.
