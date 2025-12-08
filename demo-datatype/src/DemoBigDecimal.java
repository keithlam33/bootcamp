import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // 0.2+0.1

    System.out.println(0.2+0.1);// 0.30000000000000004

    BigDecimal bd1 =BigDecimal.valueOf(0.2);
    BigDecimal bd2 =BigDecimal.valueOf(0.1);
    BigDecimal result = bd1.add(bd2);
    System.out.println(result);
    System.out.println(result.doubleValue()); // to double value 0.3 
    System.out.println(result.longValue()); // to long value 0
    System.out.println(result.intValue());

    // bigdecimal use in calculation
    // double good at presenting value
    // step 1 double (read)
    // step 2 in calculation use big decimal
    // step 3 show result in doublevalue

    // 0.3-0.1
    System.out.println(0.3-0.1);// 0.19999999999999998
    System.out.println(BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1))); // 0.2


    //0.1*0.2
    System.out.println(0.1*0.2); //0.020000000000000004
    // multiply()
    System.out.println(BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2)));// 0.02


    // 0.25123 *0.15 multiply only rounding problem
    double x = 0.25123;
    double y = 0.15;
    System.out.println(BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y)));// 0.0376845
    System.out.println(BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y))
    .setScale(2, RoundingMode.HALF_UP).doubleValue()); // 0.04 // half up 4捨五入 half=5
    System.out.println(BigDecimal.valueOf(0.5).multiply(BigDecimal.valueOf(0.5))
    .setScale(1, RoundingMode.HALF_DOWN).doubleValue()); // 0.2, 0.25  half=5 down

    // 


  }
}
