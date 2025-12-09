public class leetcodenote {
  public static void main(String[] args) {
    // leet 1370 
    int[] arr= new int[26]; // 0-25 a-z 
        for(int i=0; i<s.length(); i++) {
            arr[(s.charAt(i) - 'a')] ++; // s.charAt(i)-'a' -> 0-25
            // charAt 取出第 i 個字元
            //把 '某' 和 'a' 的 ASCII 碼相減
            // arr[ 某數 與'a'的差距 ＝第幾格 0開始 
            // 再++  arr 對應abcd...z count
            // 字元 → 索引：ch - 'a'
            //索引 → 字元：(char)(i + 'a') int + char = int, so need consent(char)to char
        } 
        
    
        
        
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

        

  
  
  
    }
}
