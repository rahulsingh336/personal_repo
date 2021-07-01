package random;

import java.util.function.Consumer;

interface Sayable{
	void say();
}
public class MethodReference {
	public static void saySomething(String t){
		System.out.println("Hello, this is static method.");
		System.out.println(t);
	}
	public static void main(String[] args) {
		// Referring static method
		//random.Sayable sayable = random.MethodReference::saySomething;
		Consumer<String> consumer = MethodReference::saySomething;
		// Calling interface method
		//sayable.say();
		consumer.accept("");
	}
}  