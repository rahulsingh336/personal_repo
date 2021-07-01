package race;


import java.util.ArrayList;
import java.util.List;

public class BetweenOperation implements Operations {

    public ArrayList<Object> getBetweenCriteriaList() {
        return betweenCriteriaList;
    }

    public void setBetweenCriteriaList(ArrayList<Object> betweenCriteriaList) {
        this.betweenCriteriaList = betweenCriteriaList;
    }

    ArrayList<Object> betweenCriteriaList;
    private static BetweenOperation betweenOperation = null;

    public BetweenOperation() {
        betweenCriteriaList = new ArrayList<>();
    }

    public static BetweenOperation getInstance() {
        if (betweenOperation == null) {
            synchronized (BetweenOperation.class) {
                betweenOperation = new BetweenOperation();
            }
        }
        return betweenOperation;
    }

    @Override
    public void formQuery(String column, List<Object> listOfValues) {
        if (listOfValues.size() == 2) {
            betweenCriteriaList.add(listOfValues);
        }

    }

    @Override
    public void aggregateQuery() {
        if (betweenCriteriaList.size() > 0) {
            Object[] inCriteriaList = getBetweenCriteriaList().toArray(new Object[getBetweenCriteriaList().size()]);
            //query.add("");
            setBetweenCriteriaList(new ArrayList<>());
        }
    }
}
