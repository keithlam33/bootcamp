public class loop2 {
  public static void main(String[] args) {
             // case loop, from 1-100, an even number, money +4
     


 // while (條件) {
   // 做你要做的事（判斷、加錢…）
   // i++;        ← 一定要放最後！每輪都走一步
//}

String ct = "23:42:00";
    int stoadd = 6500;
    int chour = (ct.charAt(0)-'0')*10 + (ct.charAt(1)-'0');
    int cmin = (ct.charAt(3)-'0')*10 + (ct.charAt(4)-'0');
    int csec = (ct.charAt(6)-'0')*10 + (ct.charAt(7)-'0');
    int ctsecond= chour *60 *60 + cmin *60 + csec;
    int totalsec= (ctsecond + stoadd)%
    





  }
}
