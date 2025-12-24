import java.util.ArrayList;

public class DemoPassByReference {
  



  public static void main(String[] args) {
    sum(10,3); // 103
    int x = 15; // pass by value
    System.out.println(sum(x,6));// 106
    System.out.println(x);// 15

    // Array (pass by reference)
    int[] arr = new int[] {-9, -100, 73};
    addOne(arr);
    System.out.println(arr);

    ArrayList<Cat> cats = new ArrayList<>();
    cats.add(new Cat("Sue"));

    doubleTheCat(cats);
  }

  // pass by value: all primitives, string, all wrapper class
  // pass by reference: array, all other classes
  public static int sum(int x, int y) {// pass by value(a copy of value)
    x=100;
    return x+y;
  }

  public static void addOne(int[] arr){// pass by reference將地址pass過去 操作完不用return 地址出去
    if(arr ==null) 
      return;
    for(int i =0; i<arr.length; i++) {
      arr[i]++;
    }
  }
//variable
  public static void doubleTheCat(ArrayList<Cat> cats){
    ArrayList<Cat> doubleCats = new ArrayList<>();
    for(Cat cat: cats){
      doubleCats.add(cat);
      doubleCats.add(cat);
    }

    cats = doubleCats;
    //信封裝一個地址 地址搵到一個object
  }
}
