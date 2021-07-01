package random;

public class VarArgsTest {

  public static void main(String[] args) {
	  sum(1,"2", "3", "4", "5");
  }

	public static int sum(int i, String... js ){
		System.out.println("sum1 called");
    	System.out.println(js.length);
    	StringBuilder stringBuilder = new StringBuilder();
    	for(String ij : js){
      System.out.println(ij);
      stringBuilder.append(ij);
		}
    System.out.println(stringBuilder.toString());
		return 0;
	}
}
