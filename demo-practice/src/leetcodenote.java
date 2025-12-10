public class leetcodenote {
  public static void main(String[] args) {
    // leet 1370 
    int[] arr= new int[26]; // 0-25 a-z 
        for(int i=0; i<s.length(); i++) {
            arr[(s.charAt(i) - 'a')] ++;} // s.charAt(i)-'a' -> 0-25
            // charAt 取出第 i 個字元
            //把 '某' 和 'a' 的 ASCII 碼相減
            // arr[ 某數 與'a'的差距 ＝第幾格 0開始 
            // 再++  arr 對應abcd...z count
            // 字元 → 索引：ch - 'a'
            //索引 → 字元：(char)(i + 'a') int + char = int, so need consent(char)to char
        // s.charAt(i) - '0' → 把數字字元變成真正的數字
        // '5' - '0' = 53 - 48 = 5 → 真正的數字 5
        //「字元數字轉整數」的標準寫法！
        // s.charAt(i) - 'a' → 把字母變成索引（0~25
        //統計字母出現次數  小寫字母  count[s.charAt(i) - 'a']++
        //把數字字元變數字  "12345"   int digit = s.charAt(i) - '0'
        //把數字變回字元digit = 5(char)(digit + '0') → '5'
        // 把索引變回字母i = 11(char)(i + 'a') → 'l'
        StringBuilder result = new StringBuilder();
        while( result.length() < s.length()) {// 做到result string夠數 ＝s.length就停
                //step 1 & 2
            for(int i =0; i <arr.length; i++) {
                if(arr[i]>0){
                    result.append( (char)(i +'a'));
                    arr[i] --;
                }
                
            } // step 3&4
            for(int i= arr.length-1; i >=0; i--) {
                if(arr[i]>0){
                    result.append( (char)(i +'a'));
                    arr[i] --;
                }
            }
        } return result.toString();
  
  
   // 344 reverse string swap
        char backup = ' ';
        for(int i = 0; i <s.length/2 ; i++) {// in java, /2 = median
                backup = s[i];
                s[i] = s[s.length-i-1];
                s[s.length-i-1] = backup;
                
        }

        // 1876 substring of size three
        int count =0;
        for(int i =0; i<s.length()-2; i++) {// -2 because +2 in later procedure
            if(s.charAt(i) == s.charAt(i+1)
            || s.charAt(i) == s.charAt(i+2)
            ||s.charAt(i+2) == s.charAt(i+1)) { // one condition fulfil repeated substring
                continue; // if fulfil skip to next round check next i 
            }else{
                count++;
            }
        }
        return count;
        
        //2278 percentage of letter in string, rounding
        int count =0;
       for( int i=0; i<s.length(); i++) {
            if( s.charAt(i) == letter){
                count++;
            }
       }return count* 100/s.length() ; // 變int 自動round, 先* 100 因為if count/s.length 0.xxxx
        



  
  
  
    }
}
