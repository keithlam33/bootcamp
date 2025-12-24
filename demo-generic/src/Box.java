public class Box<T> {
    private T value;

    public Box() {

    }
    public Box(T value){
      this.value=value;
    }

    public void setValue(T value){
      this.value=value;
    }
    public T getValue() {
      return this.value;
    }
    public static void main(String[] args) {
      // Generic 比你寫少啲class 在compile time confirm T
      // how why寫少左 
    Box<String> stringBox = new Box<>();
    stringBox.setValue("John");
    System.out.println(stringBox.getValue().charAt(0));
    Box<Integer> integerBox = new Box<>();
    integerBox.setValue(100);
     
    
    }
}
