package logicmonitor;

import java.util.Arrays;

public class ArrangeIntegers {

  public static void main(String[] args) {
	  arrange();
  }

	public static void arrange() {
		int[] arr = {0, 2, -1,2, 4};

		int key, j;

		for(int i = 0; i < arr.length; i++) {
			key  = arr[i];

			if (key >= 0)
			continue;
			j = i-1;
			while (j >=0 && arr[j] >= 0){
				arr[j+1] = arr[j];
				j = j-1;
			}

			arr[j + 1] = key;

		}
		Arrays.stream(arr).forEach(System.out::println);
	}
}
