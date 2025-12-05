public class DemoArray {
  public static void main(String[] args) {
    int x =3; 
    // array -> store a set of same type values
    // arr is a variable name
    // int[] array is to describe the type of variable
    int[] arr = new int[4]; //4 -> length of array (rooms)
    // new int [] -> create address 
    // auto allocate memory location
    //arr[0] -> head address, quick, locate a[1] by head address
    arr[0] = 23;
    arr[1] = 49; // put 49 next to arr[0]
    arr[2] = 71;
    arr[3] = 100;
    // cant arr[4]= 200, because length is 4, out of rooms
    //ArrayIndexOutOfBoundsException

    //arr.length 
    System.out.println("arr.length = "+ arr.length);
    for( int i =0; i< arr.length; i++) { // 0-3
      System.out.println(arr[i]);
    }

    // string []
    // apple banana kiwi
    // for loop
    String[] arrs = new String[3];
    arrs[0] = "apple";
    arrs[1] = "banana";
    arrs[2] = "kiwi";
    for( int i =0; i< arrs.length; i++) {
        System.out.println(arrs[i]);
    }

    // char[]
    //  i, j, k 
    char[] arrc = new char[3];
    arrc[0] = 'i';
    arrc[1] = 'j';
    arrc[2] = 'k';
    for( int i=0; i<arrc.length; i++) {
          System.out.println(arrc[i]);
    }

    // boolean[]
    // true,false, true
    boolean[] arrb= new boolean[3];
    arrb[0] = true;
    arrb[1] = false;
    arrb[2] =true;
    for(int i=0; i<arrb.length; i++) {
        System.out.println(arrb[i]);
    }

    // "John", "Tommy", "Steven"
    String[] names = new String[] {"John", "Tommy","Steven"};// already define length(3)
    // name"s", tell yourself names is an array
    for( int i=0; i<names.length; i++) {
        System.out.println(names[i]);
    }
    




  }
}
