package exerciseW.java;

public class Archer extends Hero {

  private String name;

  public Archer() {
    super(1, Heros.maxHp(Heros.ARCHER, 1));
  }

  public Archer(String name) {
    super(1, Heros.maxHp(Heros.ARCHER, 1));
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getRole() {
    return Heros.ARCHER;
  }

  public static void main(String[] args) {
    Archer archer = new Archer();
    System.out.println(archer.getHp());
    System.out.println(archer.getPa());

    System.out.println(Math.random()); // 0-1
  }



}
