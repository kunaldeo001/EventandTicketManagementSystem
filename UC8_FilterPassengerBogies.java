import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class BogieUC8 {
    String type;
    int capacity;
    String category;

    BogieUC8(String type, int capacity, String category) {
        this.type = type;
        this.capacity = capacity;
        this.category = category;
    }

    @Override
    public String toString() {
        return type + " (" + category + ")";
    }
}

public class UC8_FilterPassengerBogies {
    public static void main(String[] args) {
        List<BogieUC8> train = new ArrayList<>();
        train.add(new BogieUC8("Sleeper", 72, "Passenger"));
        train.add(new BogieUC8("AC", 64, "Passenger"));
        train.add(new BogieUC8("Flatcar", 0, "Freight"));
        
        List<BogieUC8> passengerBogies = train.stream()
                .filter(b -> b.category.equals("Passenger"))
                .collect(Collectors.toList());
                
        System.out.println("Passenger Bogies: " + passengerBogies);
    }
}
