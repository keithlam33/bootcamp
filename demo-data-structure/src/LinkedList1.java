public class LinkedList1 {
    private Node head;

    public LinkedList1() {
      this.head=null;
    }

    public void add(String name) {
     Node newNode = new Node(name);
     if(this.head == null){ 
      this.head = newNode;
     return;}
     Node tempHead = head;
     while(tempHead.next() != null) {
          tempHead = tempHead.next(); // ~ i++ 
     } tempHead.setNext(newNode);//把最後一個節點的 next 指向 newNode
    }
    
    public int size() {
      int count =0;
      Node tempHead = this.head;
      while(tempHead !=null) {
          count++;
          tempHead= tempHead.next();
      }return count;
    }

    public boolean isEmpty() {
      return head ==null;
    }

    public boolean contains(String name) {
      Node tempHead = this.head;
      while(tempHead !=null) {
          if(tempHead.getName().equals(name)){
            return true;
          } tempHead = tempHead.next();
      }return false;
    }

    public String remove(String target){
      if(this.head == null) return null;
      Node tempHead = this.head;
      if(tempHead.getName().equals(target)){
        this.head = tempHead.next();
        return target;
      }
      while(tempHead.next() != null) {
        if(tempHead.next().getName().equals(target)){
          Node nextNode = tempHead.next();
          tempHead.setNext(tempHead.next().next());
          return nextNode.getName();
        }
          tempHead = tempHead.next();
      }return null;
    }

    public static void main(String[] args) {
      LinkedList1 lt1 = new LinkedList1();
      lt1.add("John");
      lt1.add("Sally");
      lt1.add("Leo");
      System.out.println(lt1.size());
      System.out.println(lt1.size());
      System.out.println(lt1.size());
      System.out.println(lt1.size());





    }



}
