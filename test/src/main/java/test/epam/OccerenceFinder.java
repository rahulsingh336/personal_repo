package test.epam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccerenceFinder {

	/*Implement a solution that finds occurrence of each item in a given List of items
	and return them in an appropriate data structure.
	Solution should be generic so that it can be used in different business domains. Expose the solution as a REST API. Use Java 8 and write unit tests.*/


	public Map<Object, Long> findOccurence(List<Object> items){

		//SOLID
		return items.stream().collect(Collectors.groupingBy(
				Function.identity(), Collectors.counting()
		));

		/*for(int i= 0; i < items.size(); i++){
			Object key = items.get(i);
			Integer value = occurrenceHolderMap.get(key);
			if(value == null){
				occurrenceHolderMap.put(key, 0);
			} else {
				occurrenceHolderMap.put(key, ++value);
			}
		}
		return occurrenceHolderMap;*/
	}

}


//1, 2,1, 3
