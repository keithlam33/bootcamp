package exerciseW.java;

public class Recurve extends Bow{
   //public static final Recurve INSTANCE = new Recurve();
   public static final Recurve LEVEL_ONE ;// 世界剩一把level one recurve
   public static final Recurve LEVEL_TWO ;// 世界剩一個level two
   public static final Recurve LEVEL_THREE ;// 世界剩一個level three
    // 類似enum 的concept 
   public Recurve(int pa, int ma, double cc){
    super(pa,ma,cc);
   }

   static {
    LEVEL_ONE = new Recurve(10,20,0.3);
    LEVEL_TWO = new Recurve(20,40,0.6);
    LEVEL_THREE = new Recurve(30,50,0.8);
   }
   public static void main(String[] args) {
    Recurve.LEVEL_ONE.getPa();
   }
}
