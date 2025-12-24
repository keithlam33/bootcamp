public class Car { // only one car
  // coding pattern: singleton

  public static final Car INSTANCE = new Car("Model Y") ;
  // final what?? String or Car? final Car -> Car 不能改 
  // Car 指向的String 可以改 
  //如private final String model 就不能改model

  private String model;
  private Car(String model) {// private constrcutor 只有自己new到car 
    this.model = model;
  }
  public void setModel (String model) {
    this.model = model;
  }
  public String getModel() {
    return this.model;
  }
  public static void main(String[] args) {
    Car c1 = Car.INSTANCE;
    c1.setModel("Model 3");
    System.out.println(c1.getModel());
  }
  
  

}
