import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PassengerBogie implements Comparable<PassengerBogie> {
    String id;
    int capacity;

    public PassengerBogie(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    @Override
    public int compareTo(PassengerBogie other) {
        // Natural sorting by capacity ascending
        return Integer.compare(this.capacity, other.capacity);
    }
    
    @Override
    public String toString() {
        return id + "(" + capacity + " seats)";
    }
}

public class UC16_SortPassengerBogies {
    public static void main(String[] args) {
        List<PassengerBogie> bogies = new ArrayList<>();
        bogies.add(new PassengerBogie("PB-01", 120));
        bogies.add(new PassengerBogie("PB-02", 72));
        bogies.add(new PassengerBogie("PB-03", 90));
        
        System.out.println("Before sorting: " + bogies);
        Collections.sort(bogies);
        System.out.println("After sorting by capacity: " + bogies);
    }
}
