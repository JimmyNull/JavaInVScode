import TestPackages.*;

public class App {

  public static void main(String[] args) throws Exception {
    LinkedList randomList = new LinkedList();
    randomList.addLast(555.66);
    randomList.addLast("hello world");
    randomList.addLast(6);
    randomList.addLast(null);
    randomList.addLast(randomList);
    randomList.printList();
  }
}
