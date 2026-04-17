import java.util.Arrays;

public class UC17_SortBogieNames {
    public static void main(String[] args) {
        String[] bogieNames = {"Sleeper", "General", "AC First Class", "Pantry", "AC Two Tier"};
        
        System.out.println("Before Array Sort: " + Arrays.toString(bogieNames));
        
        Arrays.sort(bogieNames);
        
        System.out.println("After Array Sort: " + Arrays.toString(bogieNames));
    }
}
