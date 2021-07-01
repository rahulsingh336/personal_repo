package random;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

public class TestClassLoader {

  public static void main(String[] args) throws IOException {

	  Enumeration<URL> list = TestClassLoader.class.getClassLoader().getResources("test.txt");
	  Properties prop = new Properties();
	  while (list.hasMoreElements()) {
		  URL currentURL = list.nextElement();
		  prop.load(currentURL.openStream());
	  }
    System.out.println(prop.toString());
    System.out.println(prop.get("key"));
  }
}
