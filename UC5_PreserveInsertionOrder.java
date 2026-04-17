import java.util.LinkedHashSet;
import java.util.Set;

public class UC5_PreserveInsertionOrder {
    public static void main(String[] args) {
        Set<String> insertionOrderedBogies = new LinkedHashSet<>();
        insertionOrderedBogies.add("Engine");
        insertionOrderedBogies.add("Passenger 1");
        insertionOrderedBogies.add("Freight 1");
        
        System.out.println("Bogies in insertion order: " + insertionOrderedBogies);
    }
}
