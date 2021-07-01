package leetcode.linkedList;

public class Solution2 {

  public static void main(String[] args) {

  	 ListNode listNode1 = new ListNode(1);
 	 ListNode listNode2 = new ListNode(2);
	 ListNode listNode3 = new ListNode(3);
  	 ListNode listNode4 = new ListNode(4);
  	 ListNode listNode5 = new ListNode(5);
  	 listNode1.next = listNode2;
  	 listNode2.next = listNode3;
  	 listNode3.next = listNode4;
  	 listNode4.next = listNode5;
	 ListNode listNode = removeNthFromEnd(listNode1, 2);
     System.out.println(listNode);
  }

	public static ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode slowPointer = head;

	   ListNode fastPointer = head;
	   for(int i = 0; i < n ;i++){
		fastPointer = fastPointer.next;
	   }
	   /*if(fastPointer == null ) {
	     slowPointer = null;
	   	return slowPointer;
	   }*/
	   while (fastPointer.next != null) {
          slowPointer = slowPointer.next;
          fastPointer = fastPointer.next;
	   }
	   if (fastPointer.next == null) {
	   	slowPointer = slowPointer.next;
	   	return slowPointer;
	   } else {
		   slowPointer.val = slowPointer.next.val;
		   slowPointer.next = slowPointer.next.next;
	   }



       return head;
	}
}

//1,2,3


