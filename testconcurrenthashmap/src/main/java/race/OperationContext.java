package race;


import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class OperationContext {

    private Operations operation;

    public void setOperationStrategy(Operations operation) {
        this.operation = operation;
    }

    public void buildOperatorClausePart(String column, List<Object> objects) {
        operation.formQuery(column, objects);
    }

    public Object buildOperatorWhereClause(Object query, Map<String, Operations> o) {
        Operations in = null;
        List<Operations> allOperations = new LinkedList<>();
        allOperations.add(in);
        for (Operations operation : allOperations) {
            operation.aggregateQuery();
        }

        return query;
    }

    /*public Criteria buildInternalQueryWhereClause(Criteria query, Map<String, List<Object>> queryMap,
                                                  Map<String, QueryBuilderWithParams> internalQueryOperationMap){
        AppendOperation internalQueryOperation = InternalQueryOperation.getInstance();
        if (internalQueryOperationMap != null && !internalQueryOperationMap.isEmpty()){
            internalQueryOperationMap.forEach((key, queryBuilderWithParams)->{
                if(queryMap.containsKey(key)) {
                    internalQueryOperation.appendToQuery(query, queryMap.get(key),
                            queryBuilderWithParams);
                }
            });
        }
        return query;
    }*/


}