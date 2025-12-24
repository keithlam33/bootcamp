package practicenum;

public interface GameRule {
  int getRankStrength(Rank2 rank);
  
  default int compare(Rank2 r1, Rank2 r2){
    return this.getRankStrength(r1)- this.getRankStrength(r2);
  }
}
