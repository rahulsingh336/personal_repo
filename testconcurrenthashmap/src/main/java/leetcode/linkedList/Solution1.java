package leetcode.linkedList;

public class Solution1 {

  public static void main(String[] args) {

  	 ListNode listNode1 = new ListNode(4);
  	 ListNode listNode2 = new ListNode(5);
  	 ListNode listNode3 = new ListNode(1);
  	 ListNode listNode4 = new ListNode(9);
  	 listNode1.next = listNode2;
  	 listNode2.next = listNode3;
  	 listNode3.next = listNode4;
  	 deleteNode(listNode4);
    System.out.println(listNode3);
  }

	public static void deleteNode(ListNode node) {

  	if (node.next == null) return;

  	ListNode temp = node.next;
  	node.val = temp.val;
  	if (temp.next == null) {
  		node.next = null;
	} else {
		node.next = temp.next;
	}
	}
}

class ListNodeT {
      int val;
      ListNode next;
      ListNodeT(int x) { val = x; }
}
