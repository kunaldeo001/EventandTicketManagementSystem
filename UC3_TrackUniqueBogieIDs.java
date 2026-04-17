import java.util.HashSet;
import java.util.Set;

public class UC3_TrackUniqueBogieIDs {
    public static void main(String[] args) {
        Set<Integer> uniqueBogieIDs = new HashSet<>();
        uniqueBogieIDs.add(1001);
        uniqueBogieIDs.add(1002);
        uniqueBogieIDs.add(1001); // Duplicate, will not be added
        
        System.out.println("Unique Bogie IDs: " + uniqueBogieIDs);
    }
}
