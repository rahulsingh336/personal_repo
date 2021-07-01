package overload;

import java.util.LinkedList;
import java.util.List;

public class OOMErrorTest {
	public static void main(String[] args) {
		List<Long> ll = new LinkedList<Long>();

		try {
			long l = 0;
			while(true){
				ll.add(new Long(l++));
			}
		} catch(OutOfMemoryError oome){
			System.out.println("Error catched!!");
		}
		System.out.println("Test finished");
	}
}
