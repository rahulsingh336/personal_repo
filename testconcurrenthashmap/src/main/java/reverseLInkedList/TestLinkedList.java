package reverseLInkedList;

public class TestLinkedList {

  public static void main(String[] args) {

	  Node node1 = new Node(1);
	  Node node2 = new Node(2);
	  Node node3 = new Node(3);
	  node1.next = node2;
	  node2.next = node3;
     Node reverse =  reverse(node1);
    System.out.println(reverse);
  }

  private static Node reverse(Node node){

	  Node prev = null;
	  Node current = node;
	  Node next = null;
	  while (current != null) {
		  next = current.next;
		  current.next = prev;
		  prev = current;
		  current = next;
	  }
    System.out.println("check");
	  return prev;
  }
}


class Node {

	int val;
	Node next;

	public Node(int val) {
		this.val = val;
		this.next = null;
	}
}