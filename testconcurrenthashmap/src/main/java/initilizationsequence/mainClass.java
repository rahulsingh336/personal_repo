package initilizationsequence;

public class mainClass {


	{
    System.out.println("mainclass");
	}

	static {
		System.out.println("mainclass staitc");
	}

  public static void main(String[] args) {
	  Parent parent = new Parent();
  }
}


class Parent {

	{
    System.out.println("testing init");
	}

	static {
		System.out.println("testing init STAIC");
	}

	public Parent() {
		System.out.println("mainclass Constructor");
	}
}
