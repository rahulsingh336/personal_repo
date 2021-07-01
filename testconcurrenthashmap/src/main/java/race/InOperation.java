package race;



import java.util.ArrayList;
import java.util.List;

public class InOperation implements Operations {

    ArrayList<Object> inCriteriaList;
    private static InOperation inOperation = null;

    InOperation() {
        inCriteriaList = new ArrayList<Object>();
    }

    public static InOperation getInstance() {
        if (inOperation == null) {
            synchronized (InOperation.class) {
                inOperation = new InOperation();
            }
        }
        return inOperation;
    }

    public InOperation getOperation() {
      return new InOperation();
    }

    public ArrayList<Object> getInCriteriaList() {
        return inCriteriaList;
    }

    public void setInCriteriaList(ArrayList<Object> inCriteriaList) {
        this.inCriteriaList = inCriteriaList;
    }

    @Override
    public void formQuery(String column, List<Object> listOfValues) {
        inCriteriaList.add(listOfValues);
    }



    public void aggregateQuery() {
        if (inCriteriaList.size() > 0) {
            Object[] inCriteriaList = getInCriteriaList().toArray(new Object[getInCriteriaList().size()]);
            //query.add("");
            setInCriteriaList(new ArrayList<>());
        }
        //return query;
    }
}
