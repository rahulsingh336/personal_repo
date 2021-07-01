package java8;

public class DefaultMethods implements I1, I2{

  public static void main(String[] args) {
	  //
  }

  ////COMPILATION ERROR IF NOT PRESENT, MUST TELL WHICH ONE TO USE.
	@Override
	public String getGreeting() {
		return I1.super.getGreeting();
	}
}

interface I1 {
	default String getGreeting() {
		return "Good Morning!";
	}
}

interface I2 {
	default String getGreeting() {
		return "Good Night!";
	}
}
