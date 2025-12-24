import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;


public class MSWord {
  private StringBuilder text;
  private Deque<Character> undoQueue;
  private Deque<Character> redoQueue;
  
  public MSWord(){
    this.text = new StringBuilder();
    this.undoQueue = new LinkedList<>();
    this.redoQueue = new LinkedList<>();
  }
  
  public void addChar(char ch){
      this.text.append(ch);
      this.redoQueue.clear();
      this.undoQueue.addLast(ch);
      
      
  }
  
  public void undo(){
    if(!this.undoQueue.isEmpty()){
    char lastChar= this.undoQueue.pollLast(););
    this.redoQueue.addLast(lastChar);  
    if(this.text.length()>=1){
    this.text.deleteCharAt(this.text.length()-1);
    }
  }
  }
  public void redo() {
    if(!this.redoQueue.isEmpty()){
      char lastChar= this.redoQueue.pollLast();
      this.text.append(lastChar);
      this.undoQueue.addLast(lastChar);
     }
  }
  public String getText() {
    return this.text.toString();
  }

  public static void main(String[] args) {
    MSWord msWord = new MSWord();

    msWord.addChar('a');
    msWord.addChar('b');
    msWord.addChar('c');
    
    msWord.undo();
    msWord.undo();
    msWord.addChar('!');
    
    System.out.println(msWord.getText());


  }
}
