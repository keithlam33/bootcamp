package practicenum;

public enum BigTwoRule implements GameRule {
  INSTANCE;

  private static final int[] STRENGTHS = new int[]{
    12,
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
    11
  };
  public int getRankStrength(Rank2 rank) {
    return STRENGTHS[rank.ordinal()]; // natural order in rank2.java
  }
  
  public static void main(String[] args) {
    GameRule rule = BigTwoRule.INSTANCE;
    System.out.println(rule.getRankStrength(Rank2._2));// 13
  
    rule = PokerRule.INSTANCE;
    System.out.println(rule.getRankStrength(Rank2._2));
  
  }


}
