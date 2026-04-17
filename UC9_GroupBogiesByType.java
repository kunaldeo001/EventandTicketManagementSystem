import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class BogieUC9 {
    String id;
    String type;

    BogieUC9(String id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return id;
    }
}

public class UC9_GroupBogiesByType {
    public static void main(String[] args) {
        List<BogieUC9> train = new ArrayList<>();
        train.add(new BogieUC9("101", "Sleeper"));
        train.add(new BogieUC9("102", "AC"));
        train.add(new BogieUC9("103", "Sleeper"));
        train.add(new BogieUC9("104", "General"));
        
        Map<String, List<BogieUC9>> bogiesByType = train.stream()
                .collect(Collectors.groupingBy(b -> b.type));
                
        System.out.println("Bogies Grouped By Type: " + bogiesByType);
    }
}
