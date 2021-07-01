package random;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatTester {

  public static void main(String[] args) {

	  String str = String.format("The %2s has %1s moons", "Saturn", 53);
    	//System.out.println(str);
	  //Pattern pattern = Pattern.compile("/authorization/role", Pattern.CASE_INSENSITIVE);
	  //Matcher matcher = pattern.matcher("/authorization/role/11c3a741-49c3-ace2-8098-1ae282ace280");
    //System.out.println(matcher.matches());
	  //A, B, C, D
	  //A, C, B
	  Map<String, String> keyvalue = new HashMap<>();
	  keyvalue.putIfAbsent("A", "dummy Value - A");
	  keyvalue.putIfAbsent("B", "dummy Value - B");
	  keyvalue.putIfAbsent("C", "dummy Value - C");
	  keyvalue.putIfAbsent("D", "dummy Value - D");

	  Map<String, String> keyvalueOrder = new LinkedHashMap<>();

	  System.out.println(str);

  }
}
