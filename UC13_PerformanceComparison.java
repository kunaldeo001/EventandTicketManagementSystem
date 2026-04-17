import java.util.ArrayList;
import java.util.List;

public class UC13_PerformanceComparison {
    public static void main(String[] args) {
        List<Integer> seatCapacities = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            seatCapacities.add(72);
        }
        
        // Loop Implementation
        long startTimeLoop = System.nanoTime();
        int sumLoop = 0;
        for (int capacity : seatCapacities) {
            sumLoop += capacity;
        }
        long loopTime = System.nanoTime() - startTimeLoop;
        
        // Stream Implementation
        long startTimeStream = System.nanoTime();
        int sumStream = seatCapacities.stream().mapToInt(Integer::intValue).sum();
        long streamTime = System.nanoTime() - startTimeStream;
        
        System.out.println("Sum (Loop): " + sumLoop + " | Time: " + loopTime + " ns");
        System.out.println("Sum (Stream): " + sumStream + " | Time: " + streamTime + " ns");
    }
}
