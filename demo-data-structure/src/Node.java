public class Node {
  private Node next;
  private String name;

  public Node(String name){
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node next() {
    return this.next;
  }


}
