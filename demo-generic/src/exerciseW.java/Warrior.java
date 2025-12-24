package exerciseW.java;

import java.util.Random;

public class Warrior extends Hero {
  
  public Warrior(){
    super(50, 10, 0.15);
  }
  @Override
  public void attack() {
    Random rand = new Random();
    int damage = getPa();

  }

  // 
}
