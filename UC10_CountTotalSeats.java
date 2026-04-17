import java.util.ArrayList;
import java.util.List;

class BogieUC10 {
    String id;
    int seats;

    BogieUC10(String id, int seats) {
        this.id = id;
        this.seats = seats;
    }
}

public class UC10_CountTotalSeats {
    public static void main(String[] args) {
        List<BogieUC10> train = new ArrayList<>();
        train.add(new BogieUC10("101", 72));
        train.add(new BogieUC10("102", 64));
        train.add(new BogieUC10("103", 90));
        
        int totalSeats = train.stream()
                .map(b -> b.seats)
                .reduce(0, Integer::sum);
                
        System.out.println("Total Seats in Train: " + totalSeats);
    }
}
