package TestPackages;

/**
 * @class my own Linked List implementation
 */
public class LinkedList {

  private Node head;

  public class Node {

    private Object data;
    private Node next;

    public Node(Object data) {
      this.data = data;
      next = null;
    }
  }

  public LinkedList() {
    head = null;
  }

  /**
   * add new node to list as last element
   * @param data the new node data
   */
  public void addLast(Object data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node cur = head;
      while (cur.next != null) {
        cur = cur.next;
      }
      cur.next = newNode;
    }
  }

  public void printList() {
    Node cur = head;
    while (cur != null) {
      if (cur.data == null) {
        System.out.print("null" + " ");
      } else {
        System.out.print(cur.data.toString() + " ");
      }
      cur = cur.next;
    }
    System.out.println();
  }
}
