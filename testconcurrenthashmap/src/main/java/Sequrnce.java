public class Sequrnce extends P{

	static {
    System.out.println("Static Sequrnce");
	}

	public Sequrnce() {
		System.out.println("Constructor Sequrnce");
	}

	{
		System.out.println("initilzator Sequrnce");
	}

	public static void main(String[] args) {
    System.out.println("Before");
    Sequrnce sequrnce = new Sequrnce();
    System.out.println("After");
  }
}

class P{
	static {
		System.out.println("Static P");
	}

	public P() {
		System.out.println("Constructor P");
	}

	{
		System.out.println("initilzator P");
	}

}
