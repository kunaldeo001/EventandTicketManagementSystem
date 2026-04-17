import java.util.Arrays;

public class UC19_BinarySearchBogieID {
    public static void main(String[] args) {
        // Binary search requires sorted array
        int[] bogieIDs = {1054, 2033, 3042, 4011, 5099};
        Arrays.sort(bogieIDs); // Ensure it's sorted
        
        int targetID = 3042;
        int resultIndex = Arrays.binarySearch(bogieIDs, targetID);
        
        if (resultIndex >= 0) {
            System.out.println("Bogie ID " + targetID + " found at index " + resultIndex + " using Binary Search.");
        } else {
            System.out.println("Bogie ID " + targetID + " not found.");
        }
    }
}
