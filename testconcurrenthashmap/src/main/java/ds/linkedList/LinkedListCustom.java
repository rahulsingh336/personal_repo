package ds.linkedList;

public class LinkedListCustom {

	Node head;

	public LinkedListCustom() {
		this.head = null;
	}

	public void insert(Object obj) {
		Node node = new Node(obj);
      if(this.head == null){
      	head = node;
      	head.next = null;
      	return;
	  }
      checkAndAdd(head, node);
	}

	public void print(){
		Node temp = head;
        while (temp != null) {
         System.out.println(temp.key);
         temp = temp.next;
		}
	}

	private void checkAndAdd(Node node, Node obj) {
		if(node.next == null) {
			node.next = obj;
			return;
		}
		checkAndAdd(node.next, obj);
	}
}

class Node {

	Object key;
	Node next;

	public Node(Object key) {
		this.key = key;
	}
}
