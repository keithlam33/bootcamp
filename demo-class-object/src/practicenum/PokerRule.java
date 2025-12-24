package practicenum;

public enum PokerRule implements GameRule{
  INSTANCE;
  private static final int[] STRENGTHS = new int[]{
    
    13,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11,
    12,
  };
  private static final int[] STRENGTHSOFSUITS = new int[] {
    1,2,3,4
  };
  public int getRankStrength(Rank2 rank) {
    return STRENGTHS[rank.ordinal()]; // give index in order
  }
  public int getSuitStrength(Suits2 suit){
    return STRENGTHSOFSUITS[suit.ordinal()];
  }

  
}
