package random;

import java.util.HashMap;
import java.util.Map;

public class TestStreamForNullMap {

  public static void main(String[] args) {

	  Config config = new Config();
    config.getEndPoints().values().stream()
        .forEach(
            s -> {
				System.out.println(s);
            });
  }
}


class Config{

	private Map<String, String> endPoints = new HashMap<>();

	public Map<String, String> getEndPoints() {
		return endPoints;
	}

	public void setEndPoints(Map<String, String> endPoints) {
		this.endPoints = endPoints;
	}
}