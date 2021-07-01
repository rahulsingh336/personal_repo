package random;

public class Counter {

	private static ThreadLocal<Integer> counter
			=
			new ThreadLocal<Integer>();
	static {
		counter.set(0);
	}

	public static int getCountInThread() {
		return counter.get();
	}

	public static void setCountInThread(int x) {
		counter.set(x);
	}

}