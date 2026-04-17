import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String type;
    int capacity;
    
    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
    
    @Override
    public String toString() {
        return type + " (" + capacity + ")";
    }
}

public class UC7_SortBogiesByCapacity {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC", 64));
        bogies.add(new Bogie("General", 90));
        
        // Sort by capacity using Comparator
        Collections.sort(bogies, new Comparator<Bogie>() {
            @Override
            public int compare(Bogie b1, Bogie b2) {
                return Integer.compare(b1.capacity, b2.capacity);
            }
        });
        
        System.out.println("Bogies sorted by capacity: " + bogies);
    }
}
