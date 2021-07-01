package race;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class test implements Runnable {

	static List<Integer> ls = new ArrayList<Integer>();
	static List<Integer> ls1 = new CopyOnWriteArrayList<>();

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new test());
		Thread t2 = new Thread(new test());
		Thread t3 = new Thread(new test());
		Thread t4 = new Thread(new test());
		Thread t5 = new Thread(new test());
		Thread t6 = new Thread(new test());
		Thread t7 = new Thread(new test());

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println(ls.size());
		for (int i = 0; i < ls.size(); ++i) {
			System.out.println(i + "  " + ls.get(i));
		}
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; ++i) {
				ls.add(i);
				//Thread.sleep(5);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
