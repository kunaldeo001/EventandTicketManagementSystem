import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String id;
    double weightTons;

    GoodsBogie(String id, double weightTons) {
        this.id = id;
        this.weightTons = weightTons;
    }
}

public class UC12_SafetyComplianceCheck {
    public static void main(String[] args) {
        List<GoodsBogie> goodsTrain = new ArrayList<>();
        goodsTrain.add(new GoodsBogie("G1", 45.5));
        goodsTrain.add(new GoodsBogie("G2", 50.0));
        goodsTrain.add(new GoodsBogie("G3", 80.5)); // Overweight
        
        double maxWeightLimit = 60.0;
        
        boolean isSafe = goodsTrain.stream()
                .allMatch(b -> b.weightTons <= maxWeightLimit);
                
        if (isSafe) {
            System.out.println("Train is safe for departure.");
        } else {
            System.out.println("Train fails safety compliance check due to overweight bogies.");
        }
    }
}
