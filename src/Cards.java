public class Cards {
        private int rank;
        private int suit;

        public Cards(int rank, int suit) {
            this.rank = rank;
            this.suit = suit;}

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {null, "Ace", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "Jack", "Queen", "King"};
        String s = ranks[this.rank] + " of " + suits[this.suit];

        public String toString() {
            String[] ranks = {null, "Ace", "2", "3", "4", "5", "6",
                    "7", "8", "9", "10", "Jack", "Queen", "King"};
            String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
            String s = ranks[this.rank] + " of " + suits[this.suit];
            return s;}

        public static void printDeck(Cards[] kaart) {
        for (Cards card : kaart) {
            System.out.println(card);
         }
        }



}
