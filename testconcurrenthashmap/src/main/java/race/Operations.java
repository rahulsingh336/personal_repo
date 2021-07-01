package race;


import java.util.List;

public interface Operations {
    void formQuery(String column, List<Object> objects);
    void aggregateQuery();
}
