public class Card {
  private Ranks rank;// A 2 3 4 5 6 7 8 9 T J Q K
  private char suit;// D C H S
// constructor
  public Card(Ranks rank, char suit){
    this.rank = rank;
    this.suit = suit;
  }   
  public Card (char rankValue, int seq, char suit) {
    this.rank = new Ranks(rankValue, seq);
    this.suit = suit; 
  }
// static link to constructor 
public static Card ofAce(char suit) {
  return new Card('A', 12, suit);
} // card.ofAce('D') static method to constructor
//點解要咁打 有咩其他方法 會有什麼不同 

  public Ranks getRank() {
    return this.rank;
  }
  public char getSuit() {
    return this.suit;
  }
public String toString() {
  return "Card(" + "rank=" + this.rank + ",suit=" + this.suit +")";
}

}
