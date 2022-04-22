package Practice.DeckOfCards;

import java.security.SecureRandom;

class DeckOfCards {

    private static final SecureRandom randNumbers = new SecureRandom();
    private static final int number_of_cards = 52;

    private Cards[] deck = new Cards[number_of_cards];
    private int currentCards = 0;

    public  DeckOfCards() {
        String[] faces = {
                "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Jack", "Queen", "King"};
        String[] suits = {
                "Hearts", "Diamonds", "Clubs", "Spades"};

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Cards(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle () {
        currentCards = 0;

        for (int first = 0; first < deck.length; first++) {

            int second = randNumbers.nextInt(number_of_cards);
            Cards temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }

    }

    public Cards dealCards () {

        if (currentCards < deck.length) {
            return deck[currentCards++];
        }

        return null;
    }

}


