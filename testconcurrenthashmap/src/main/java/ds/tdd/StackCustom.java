package ds.tdd;

public class StackCustom {

	private static final int DEFAULT_ARRAY_SIZE = 32;
	private int top = -1;
	private int size = 0;
	private Object[] internalArray = null;

	public StackCustom() {
		internalArray = new Object[DEFAULT_ARRAY_SIZE];
	}

	public boolean isEmpty() {
		return this.top == -1 ? true : false;
	}


	public Object push(Object x) {
		internalArray[top + 1] = x;
		size++;
		top++;
		return x;
	}

	public int size() {
		return this.size;
	}

	public Object pop() {
        int len = this.size();
        internalArray[len] = null;
		top--;
		size--;
		return internalArray[len - 1];
	}
}
