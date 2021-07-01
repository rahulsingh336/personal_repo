package race;

import java.util.*;

public class TestMapAddition {

  public static void main(String[] args) {
	  Operations in = OperatorTypes.valueOf("IN").createOperation();

	  Map<String, List<Object>> queryMap = new HashMap<>();
	  ArrayList<Object> value = new ArrayList<>();
	  ArrayList<Object> value1 = new ArrayList<>();
	  value.add("A1");
	  value.add("A2");
	  value1.add("B1");
	  value1.add("B2");
	 // queryMap.put("A", value);
	 // queryMap.put("B", value1);
	   queryMap.put("IN", value1);
	   queryMap.put("BETWEEN", value);
	  //queryMap.put("Test2", value1);
	  /*queryMap.put("C", new ArrayList<>());
	  queryMap.put("D", new ArrayList<>());*/

	  WeakHashMap<String, Object> operationMap = new WeakHashMap<>();
	  operationMap.put("IN", "testing*");
	  operationMap.put("BETWEEN", "testing*");
	  //operationMap.put("Test2", "testing*1");
	  Map<String, Operations> colOperationValueHolderMap = new HashMap<>();
	  operationMap.forEach((colName, operatorTypes) -> {
		  Operations operation = OperatorTypes.valueOf(colName).createOperation();
		  colOperationValueHolderMap.put(colName, operation);
	  });


	  OperationContext ctx = new OperationContext();
	  queryMap.forEach((columnName, filterValues) -> {
		  ctx.setOperationStrategy(colOperationValueHolderMap.get(columnName));
		ctx.buildOperatorClausePart(columnName, filterValues);
	  });
    ctx.buildOperatorWhereClause(null, colOperationValueHolderMap);
  }
}
