import practice.Hero;

public class Mage extends Hero{
    private static int MAX_HP = 90;
    private static int MAX_MP = 100;
    private static int PA = 100;
    private static int PD = 100;
    private static int AG = 110;
    private static int MA = 100;
    private static int MD = 100;
    private static int CD = 90;
    private static int CC = 110;

  public void levelUp() {
      this.setLevel(this.getLevel() + 1);
      this.setHp(MAX_HP);
    }
}
