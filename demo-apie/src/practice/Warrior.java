package practice;


public class Warrior extends Hero {
  private static final int STARTING_LEVEL = Heros.STARTING_LEVEL;
private String name;
 public Warrior() {
    super(STARTING_LEVEL, Heros.maxHp(Heros.WARRIOR, STARTING_LEVEL));
 }
  public Warrior(String name) {
      super(STARTING_LEVEL, Heros.maxHp(Heros.WARRIOR, STARTING_LEVEL));
      this.name = name;
    }
  //presentation
    
@Override
  public String getName() {
    return this.name;
  }
  
  @Override
  public int getRole(){
    return Heros.WARRIOR;
  }
  
  public void superDefense() {
    System.out.println(this.name + " -> Warrior special skill.");
  }
    public static void main(String[] args) {
      Archer a1 = new Archer();
      System.out.println(a1.getHp());
      System.out.println(a1.getPa());

      Warrior w1 = new Warrior();
      System.out.println("w1's hp = " +w1.getHp());
      a1.attack(w1);
      a1.attack(w1);
      a1.attack(w1);
      System.out.println(w1.getHp());

      //polymorphism
      //object reference type can be different from object type
      // left parent right child
      Hero hero = new Archer();// 指住archer的所有object
      // Archer a2 = new Hero(); cant
      // 可以開hero array for looping
      Hero[] myheros = new Hero[2];
      myheros[0] = new Warrior();
      myheros[1] = new Archer();

      Hero target = new Warrior();// object refernce type:Hero
      // object type: warrior
      for(Hero h : myheros){// loop 緊抽象的野 
// 問題 during comile time, java won't confirm the actual object type
// based on object reference type for calling method
// solve: add abstract method
        h.attack(target);
      }
      // hero cat
      Object o = new Cat();// hiding
      o= new Warrior();

      Object[] heros = new Object[2];
      heros[0] = new Warrior();
      heros[1] = new Archer();

     // heros[1].attack();// 因為object 太high level
      Hero[] heros2 = new Hero[2];
      heros2[0] = new Warrior();
      heros2[1]= new Archer();
      // 開h

      // downcast
      for(Hero h : myheros) {
        if( h instanceof Warrior) {
          Warrior w2 = (Warrior)h;
          w2.superDefense();
        }
        h.attack(target);
      }
    }
}
