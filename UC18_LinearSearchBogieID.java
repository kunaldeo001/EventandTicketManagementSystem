public class UC18_LinearSearchBogieID {
    public static void main(String[] args) {
        int[] bogieIDs = {1054, 2033, 3042, 4011, 5099};
        int targetID = 4011;
        boolean found = false;
        
        for (int i = 0; i < bogieIDs.length; i++) {
            if (bogieIDs[i] == targetID) {
                System.out.println("Bogie ID " + targetID + " found at index " + i + " using Linear Search.");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Bogie ID " + targetID + " was not found.");
        }
    }
}
