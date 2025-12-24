public class Human implements Eat, Sleep{
    private static final int MAX_HP = 100; //通常常數 不修改
    private String name;
    private int hp;// default 100hp 
    public Human(String name) {
      this.name = name;
      this.hp = 100;
    }

    public final void run(){// 子必須繼承  
      //finalised 指不能modify and override
      // meaning: 不能被取代 解釋緊絕對
      System.out.println("finalised Skill");

    }
    @Override
    public void eat() {
      this.hp = Math.min(Human.MAX_HP,this.hp+10);
    }// 邊個細啲 攞邊個
    public void deductHp(int delta) {
      this.hp = Math.max(0,this.hp-delta);// 邊個大啲 攞邊個
        }
    @Override
    public void sleep() {
      this.hp = Human.MAX_HP;
    }

    public String getName(){
      return this.name;
    }
    public static void main(String[] args) {
      Superman s1 = new Superman("Steven");

    }
}
