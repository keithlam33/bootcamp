import java.util.Arrays;

public class DemoArray3 {
  public static void main(String[] args) {
    
    // 10, 25,3,48,57
    // print all numbers
    int[] numbers= new int[] {10,25,3,48,57 };
    for(int i=0; i<numbers.length; i++) {
        System.out.println(numbers[i]);
    }

    // scores 23, 44, 67, 88, 91, 12
    // loop print all even numbers

    numbers =new int[] {23, 44,67,88,91,12};
    
    for( int i=0; i<numbers.length; i++) { // every round
        if(numbers[i] %2 == 0) {
          
            System.out.println(numbers[i]);
        }
    }


    // find the median 34, 78, 12, 89, 45, 99, 23
    numbers = new int[] {34, 78, 12, 89, 45, 99, 23};
    int median = numbers.length/2;// oddnumber:7 /2 =3  //even number 8/2=4 need 
    int max =0;

    for( int i=0 ; i<median+1; i++) {// total round: length :7-1= 6 round // 
        for( int j=0; j< numbers.length -i-1; j++) {// how many times to compare, moving 
            if(numbers[j]>numbers[j+1]) {
                max = numbers[j+1];      // swap number
                numbers[j+1] = numbers [j];
                numbers[j] = max;
            }
        }
        // break
    }
     System.out.println("The median number is " + numbers[median]);

     //bubble sort: 22, 58,13,100,97,88,66,48
     numbers = new int[] {22, 58,13,100,97,88,66,48, 37,30, 20 ,22,101};
     int min =0;
      max =0;
    median =0;
     for( int i =0; i<numbers.length-1; i++) {
        for(int j =0; j<numbers.length -1 -i; j++) {
            if(numbers[j+1]<  numbers[j]) {
                min = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = min;
            }
        }
     }min = numbers[0];
     max = numbers[numbers.length-1]; // length =13, index -1 = 12
     median = numbers[numbers.length/2] ;
     System.out.println("The smallest number is "+ min);
     System.out.println("The biggest number is "+ max);
     System.out.println("The median number is " + median);
     System.out.println(Arrays.toString(numbers));

     //prices 99.9, 13.8, 9.9, 1200
     // quantities 3, 10, 12, 20
     // amount (prices * quantities)
     double[] prices = new double[] {99.9, 13.8, 9.9, 1200};
     int[] quans = new int[] {3, 10,12,4};
     double amount =0;
     for(int i=0; i<prices.length; i++) {
          amount = prices[i]*quans[i];
          System.out.println(amount);
     }

     //
     String[] usernames= new String[] {"Johnwong", "stevenchan", "jennyng"};
     String[] passwords = new String[] {"abcd1234", "ijk789", "xyz456"};

     String usernameInput = "stevenchan";
     String passwordInput = "ijk789";
     boolean isUser = false;
     boolean isPass = false;
    // 1 username is not found
    // 2 username is found but password is wrong
    // 3 login success
    
      for (int i=0; i<usernames.length; i++) {
          if(usernameInput.equals(usernames[i])) {
              isUser = true;
              if (passwordInput.equals(passwords[i])) {
                isPass = true;
                
              }break;
          } //break;// if{} else break;
        }
      
   if (!isUser) {
      System.out.println("Username is not Found.");
    }else if (!isPass) {
      System.out.println("Username is found but password is wrong.");
    } else {
      System.out.println("login Success!");
    }

    // ages 16,66,18,37
    // genders 'M', 'F', 'M', 'F'
    // smokers false, true, true, false
    // base fee =100
    //1 smoker ->+20%
    // 2 age >60 ->+30%
    // 3 genders female -> 5%

    // calculate fees
    

    String[] names = new String[] {"John", "Peter", "Apple", "Kim"};
    int[] ages = new int[] {16,66,18,37};
    char[] genders = new char[] {'M', 'F', 'M', 'F'};
    boolean[] smokers= new boolean[] {false, true, false, true};
    double basefee= 100;
    double percentage =0;
    for(int i=0; i<ages.length;i++) {
        if(smokers[i]) {
          percentage += 20;
          }
          if (ages[i]>60) {
            percentage +=30;
        }if (genders[i]== 'F') {
          percentage += 5;
        }
        double fees = basefee *(1+ percentage/100);
        System.out.println(names[i]+ "'s fee is "+fees);
    }
// if print array fee, different method

  String s= "hello";
  char s2 = ' ';
  int ans = 0;
  int sum =0;
  for( int i=0; i<s.length()-1; i++){
    if (s.charAt(i)> s.charAt(i+1)) {
       ans = s.charAt(i)-s.charAt(i+1);
    }else {
      ans = s.charAt(i+1) - s.charAt(i);
    }
    sum += ans;
  }System.out.println(sum);

  // if :
  // ans = s.charAt(i) > s.charAt(i+1) ? s.charAt(i) -s.charAt(i+1):s.charAt(i+1) - s.charAt(i);
 
  //toCharArray()
  String staff = "John";
  char[] chs= staff.toCharArray();
  System.out.println(Arrays.toString(chs));// [J,o,h,n]



  //which letter has the max count
  char[] characters= new char[] {'a', 'z','z','z', 'd', 'z', 'u', 'i', 'a'};
  //step 1 new int[26] count each letter
  int[]counts   = new int[26];
  for(int i=0; i<characters.length; i++ ){
          counts[(characters[i]-'a')]++;
  }
  // step 2 find max
  int maxCount = counts[0];
  int targetp= 0;
  for( int i=0; i<counts.length; i++){
    if (counts[i] > maxCount) {
        maxCount = counts[i];
        targetp = i;
        
      }
  }
  System.out.println((char)(targetp+'a'));// (char)0+'a' = a

  

    

  }
}

