package random;

public class TestThreads {

	public static void main(String[] args) {

		//random.Counter counter = new random.Counter();
		First t1 = new First();
		Second t2 = new Second();
		t1.setName("random.First");
		t2.setName("random.Second");
		t1.start();
		t2.start();

	}
}

class First extends Thread{

	public void run(){
		System.out.println("random.First thread is running..." + "---" +Thread.currentThread().getName());
		Counter.setCountInThread(336);
		System.out.println(Counter.getCountInThread());
		Counter.setCountInThread(336);
		System.out.println("After setting value");
		System.out.println(Counter.getCountInThread());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Second extends Thread{

	public void run(){
		System.out.println("random.Second thread is running..." + "---" +Thread.currentThread().getName());
		System.out.println("random.Second"+" - "+Counter.getCountInThread());
	}

}


