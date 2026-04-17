import java.util.TreeSet;
import java.util.Set;

public class UC4_MaintainOrderedBogieIDs {
    public static void main(String[] args) {
        Set<Integer> orderedBogieIDs = new TreeSet<>();
        orderedBogieIDs.add(1005);
        orderedBogieIDs.add(1002);
        orderedBogieIDs.add(1008);
        
        System.out.println("Ordered Bogie IDs: " + orderedBogieIDs);
    }
}
