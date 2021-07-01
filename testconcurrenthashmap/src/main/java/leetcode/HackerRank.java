package leetcode;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class HackerRank {

  public static void main(String[] args) throws IOException {
  	List list = new ArrayList<>();
  	/*list.add("YN");
  	list.add("NN");*/
  	/*list.add("Y");
  	list.add("Y");
  	list.add("Y");
  	list.add("Y");
  	list.add("N");
	  list.add("Y");
	  list.add("Y");*/
	  list.add("YNYY");
	  list.add("YYYY");
	  list.add("YYYY");
	  //list.add("YYNY");
	  //list.add("NYYN");

	  /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	  //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	  int m = Integer.parseInt(bufferedReader.readLine().trim());

	  int dataCount = Integer.parseInt(bufferedReader.readLine().trim());

	  List<String> data = IntStream.range(0, dataCount).mapToObj(i -> {
		  try {
			  return bufferedReader.readLine();
		  } catch (IOException ex) {
			  throw new RuntimeException(ex);
		  }
	  })
			  .collect(toList());*/

	  //int result = maxStreak(m, data);

	  //bufferedWriter.write(String.valueOf(result));
	  //bufferedWriter.newLine();

	  //bufferedReader.close();
	  //bufferedWriter.close();
    System.out.println(maxStreak(4, list));
  }

	public static int maxStreak(int m, List<String> data) {

  		String tempPattern = "";
		for (int i = 0; i< m; i++) {
			tempPattern += "Y";
		}
		int[] tmpCountHolder = new int[data.size()];

		int count = 0;
		for (int i = 0; i< data.size(); i++) {
			if(data.get(i).equals(tempPattern)){
			  count++;
			} else {
				tmpCountHolder[i] = count;
				count = 0;
			}
		}
		Arrays.sort(tmpCountHolder);
		return Math.max(tmpCountHolder[data.size()-1], count);
	}
}

// YN, NN

