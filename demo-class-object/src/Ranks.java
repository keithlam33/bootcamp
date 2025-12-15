public class Ranks {
  private char value;
  private int seq;

  public Ranks(char value, int seq) {
    this.value = value;
    this.seq = seq;
  }
  //次序 
  public char getValue () {
    return this.value;
  }
  public int getSeq() {
    return this.seq;
  }
  public static Ranks[] ALL_RANKS = new Ranks[Deck.RANKS.length];



}
