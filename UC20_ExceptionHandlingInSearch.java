class BogieNotFoundException extends Exception {
    public BogieNotFoundException(String message) {
        super(message);
    }
}

public class UC20_ExceptionHandlingInSearch {
    
    public static void searchBogie(String[] bogies, String target) throws BogieNotFoundException {
        for (String b : bogies) {
            if (b.equals(target)) {
                System.out.println("Success: Bogie " + target + " is successfully located.");
                return;
            }
        }
        throw new BogieNotFoundException("Search failed. Bogie '" + target + "' does not exist in the consist.");
    }

    public static void main(String[] args) {
        String[] trainBogies = {"Engine", "B1", "B2", "S1", "S2"};
        String searchTarget = "B5";
        
        try {
            searchBogie(trainBogies, searchTarget);
        } catch (BogieNotFoundException e) {
            System.err.println("Exception Caught: " + e.getMessage());
        }
    }
}
