package practice;
public class Archer extends Hero {
    
private String name;
    public Archer() {
      super(1, Heros.maxHp(Heros.ARCHER,1));
    }
    public Archer(String name) {
      super(1, Heros.maxHp(Heros.ARCHER,1));
      this.name=name;
    }
    @Override
    public String getName() {
      return this.name;
    }

   


  
  @Override
  public int getRole(){
    return Heros.ARCHER;
  }
    public static void main(String[] args) {
      Archer a1 = new Archer();
      System.out.println(a1.getHp());
      System.out.println(a1.getPa());

          System.out.println(Math.random()); // 0-1

    }

}
