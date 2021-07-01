package ds.tdd;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackCustomTest {

	//TDD, for methods isEmpty, size, push, pop using arrayList

	@Test
	public void testStackIsEmpty(){
		StackCustom stackCustom  = new StackCustom();
		boolean stackEmpty = stackCustom.isEmpty();
		assertTrue(stackEmpty, "Stack Is not Empty");
	}

	@Test
	public void testStackSize(){
		StackCustom stackCustom  = new StackCustom();
		int stackSize = stackCustom.size();
		boolean stackEmpty = stackCustom.isEmpty();
		assertTrue(stackEmpty, "Stack Is not Empty");
		assertTrue(stackSize == 0, "Stack Is not Empty");
	}

	@Test
	public void testStackPush(){
		int x = 4;
		StackCustom stackCustom  = new StackCustom();
		stackCustom.push(x);
		int sizeOFStack = stackCustom.size();
		assertTrue(1 == sizeOFStack, "Size if Stack is not Same");
	}

	@Test
	public void testStackPushMultiple(){
		int x = 4;
		int y = 4;
		int z = 4;
		StackCustom stackCustom  = new StackCustom();
		stackCustom.push(x);
		stackCustom.push(y);
		stackCustom.push(z);
		int sizeofstack = stackCustom.size();
		assertTrue(3 == sizeofstack, "Size if Stack is not Same");
	}

	@Test
	public void testStackPop(){
		StackCustom stackCustom  = new StackCustom();
		int x = 4;
		int y = 5;
		int z = 6;
		pushDummy(stackCustom, x);
		pushDummy(stackCustom, y);
		pushDummy(stackCustom, z);

		int sizeOfstack = stackCustom.size();
		assertTrue(3 == sizeOfstack, "Size if Stack is not Same");

		stackCustom.pop();
		sizeOfstack = stackCustom.size();
		assertTrue(2 == sizeOfstack, "Size if Stack is not decremented");
	}

	private void pushDummy(StackCustom stackCustom,int x) {
		stackCustom.push(x);
	}

}
