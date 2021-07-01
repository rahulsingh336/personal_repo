package ds.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class FindMiddleElementOfLinkedList {

	//Find middle element if linkedList
  public static void main(String[] args) {
	  LinkedList<String> list = new LinkedList<>();
	  list.add("A");
	  list.add("B");
	  list.add("C");
	  list.add("E");
	  list.add("D");
	  printMiddleElement(list);
  }

	private static void printMiddleElement(LinkedList<String> list) {
  	int f = 0;
    for (int i = 0; i < list.size(); i++) {
		++f;
		++f;
		if(f >= list.size() || list.get(f) == null){
        System.out.println(list.get(i));
			break;
		}
    }
	}

	private static void findMiddleElement(ListIterator<String> stringListIterator) {
		if(stringListIterator.hasNext()){

		}
	}
}
