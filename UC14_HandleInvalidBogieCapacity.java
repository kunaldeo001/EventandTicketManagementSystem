class InvalidBogieCapacityException extends Exception {
    public InvalidBogieCapacityException(String message) {
        super(message);
    }
}

class BogieUC14 {
    String id;
    int capacity;

    BogieUC14(String id, int capacity) throws InvalidBogieCapacityException {
        if (capacity < 0 || capacity > 120) {
            throw new InvalidBogieCapacityException("Invalid capacity: " + capacity + ". Must be between 0 and 120.");
        }
        this.id = id;
        this.capacity = capacity;
    }
}

public class UC14_HandleInvalidBogieCapacity {
    public static void main(String[] args) {
        try {
            BogieUC14 validBogie = new BogieUC14("B1", 72);
            System.out.println("Created bogie with valid capacity: " + validBogie.capacity);
            
            // This will throw the exception
            BogieUC14 invalidBogie = new BogieUC14("B2", 150);
            System.out.println("Created bogie with capacity: " + invalidBogie.capacity);
        } catch (InvalidBogieCapacityException e) {
            System.err.println("Error creating bogie -> " + e.getMessage());
        }
    }
}
