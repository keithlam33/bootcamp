package practice;
import java.math.BigDecimal;
import practice.Heros;
public abstract class Hero {

  




  private int level;
  private int hp;

  public Hero(int level, int hp) {
    this.level = level;
    this.hp = hp;
  }

  // ! Learn how Parent Class get the Child information
  // abstract method get child class information
// level up in hero class, problem : not knowing role
  abstract int getRole();

  abstract String getName();
  
  // abstract void attack(Hero hero);每個hero 都會打人

  public int getHp() {
    return this.hp;
  }

  public int getLevel() {
    return this.level;
  }

  public void levelUp() {
    this.level++;
    this.hp = Heros.maxHp(getRole(), this.level);
  }

  public void deductHp(int toBeDeducted) {
    this.hp = Math.max(0, this.hp - toBeDeducted);
  }

  public boolean isAlive() {
    return this.hp > 0;
  }

  // ! Presentation
  public int getPa() {
    return Heros.pa(getRole(), this.level);
  }

  public double getCD() {
    return this.getPa() * Heros.cdMultipler(this.getRole(), this.level);
  }

  public boolean isCD() {
    return Math.random() <= Heros.cc(this.getRole(), this.level);
  }

  public void attack(Hero hero) {
    System.out.println(getName() + " is attacking " + hero.getName());
    double toBeDeducted = this.isCD() ? this.getCD() : this.getPa();
    hero.deductHp((int) (toBeDeducted));
  }
}





