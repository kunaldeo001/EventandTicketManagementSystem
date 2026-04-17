import java.util.HashMap;
import java.util.Map;

public class UC6_MapBogieToCapacity {
    public static void main(String[] args) {
        Map<String, Integer> bogieCapacityMap = new HashMap<>();
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC", 64);
        bogieCapacityMap.put("General", 90);
        
        System.out.println("Bogie Capacities: " + bogieCapacityMap);
    }
}
