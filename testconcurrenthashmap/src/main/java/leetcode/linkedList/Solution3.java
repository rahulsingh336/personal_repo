package leetcode.linkedList;

import java.util.Stack;

public class Solution3 {

  public static void main(String[] args) {
	  ListNode listNode1 = new ListNode();
	  /*ListNode listNode1 = new ListNode(1);
	  ListNode listNode2 = new ListNode(2);*/
	  /*ListNode listNode3 = new ListNode(3);
	  ListNode listNode4 = new ListNode(4);
	  ListNode listNode5 = new ListNode(5);*/
	  //listNode1.next = listNode2;
	 /* listNode2.next = listNode3;
	  listNode3.next = listNode4;
	  listNode4.next = listNode5;*/
	  reverseList(listNode1);
  }

	public static ListNode reverseList(ListNode head) {
  	    if(head ==null || head.next == null) return head;
		Stack temp = new Stack();
		temp.push(head.val);
		while (head.next!=null) {
         ListNode tmp = head;
         head = tmp.next;
		 if (head.next != null) temp.push(tmp.next.val);
		}

		ListNode tmp = head;
		while (temp.size() != 0){
			ListNode tm = new ListNode((int) temp.pop());
			tmp.next = tm;
			tmp  = tmp.next;
		}

       System.out.println("test");

		return head;
	}
}

//1,2,3,4,5
//5,4,3,2,1,
