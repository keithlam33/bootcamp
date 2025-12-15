public class Deck {
  // ! static
  //公家 
  // public static char ACE = 'A';
  // public static char TWO = 'B';
  public static Ranks[] RANKS = new Ranks[] //
  {new Ranks('A', 12), new Ranks('2', 13), new Ranks('3', 1), new Ranks('4', 2)
    ,new Ranks('5', 3), new Ranks('6', 4), new Ranks('7', 5), new Ranks('8', 6),
    new Ranks('9', 7), new Ranks('0', 8), new Ranks('J',9), new Ranks('Q', 10), new Ranks('K', 11)
  };
    
  public static char[] SUITS = new char[] //
  {'D', 'C', 'H', 'S'};

  // ! Attribute
  private Card[] cards;

  // ! control a deck has 52 cards ONLY.
  public Deck() {
    this.cards = new Card[RANKS.length * SUITS.length];
    int idx = 0;
    for (char suit : SUITS) {
      for (Ranks rank : RANKS) {
        this.cards[idx++] = new Card(rank, suit);
      }
    }
  }

  public Card[] getCards() {
    return this.cards;
  }

  public static void main(String[] args) {
    Deck d1 = new Deck();
    System.out.println(d1.getCards()[0].getRank()); // A
    System.out.println(d1.getCards()[0].getSuit()); // D 
  }
}