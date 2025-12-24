package exerciseW.java;


public abstract class Hero {

  private int level;
  private int hp;
 
public Hero(int level,  int hp) {
    this.level = level;
    this.hp = hp;
}

// abstract method get child class information
// level up in hero class, problem : not knowing role
abstract int getRole();

abstract String getName();

//abstract void attack(Hero hero); //每個hero 都會打人

public int getLevel() {
  return this.level;
}
public int getHp() {
  return this.hp;
}

public void levelUp() {
  this.level++;
  this.hp = Heros.maxHp(getRole(), this.level);
}
public void deductHp( int toBeDuducted) {
  this.hp = Math.max(0, this.hp - toBeDuducted);
}

public boolean isAlive() {
  return this.hp >0;
}
public int getPa() {
      return Heros.pa(Heros.WARRIOR, this.getLevel());
    }
// public boolean isCd() {
//   return Math.random() <= Heros.cc(Heros.WARRIOR, this.getLevel());
// }
abstract boolean isCd();
public double getCd() {
  return this.getPa()*Heros.cdMultiplier(getRole(), this.getLevel());
}
//this vs hero how??
public void attack(Hero hero) {
  System.out.println("");
  double toBeDuducted = this.isCd() ? this.getCd(): this.getPa();
  hero.deductHp((int)(toBeDuducted)); //普攻 who got hit?
}

}

