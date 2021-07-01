package random;

public class TestQueryParamSplit {

  public static void main(String[] args) {
	  String path = "/app/ping?limited=58647";
	  String t = path.contains("?") ? path.substring(0, path.indexOf("?")) : path;
    System.out.println(t);
  }
}
