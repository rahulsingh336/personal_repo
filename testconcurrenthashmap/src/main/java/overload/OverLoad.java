package overload;

public class OverLoad {

	public void test(Integer str){
    System.out.println("Test String!!");
	}

	public void test(String s){
		System.out.println("Test Integer!!");
	}

  public static void main(String[] args) {
	  OverLoad overLoad = new OverLoad();
	  //overLoad.test(null);
  }
}
