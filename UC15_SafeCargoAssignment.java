public class UC15_SafeCargoAssignment {
    public static void main(String[] args) {
        String cargo = null;
        try {
            System.out.println("Attempting to assign cargo...");
            // Simulate NullPointerException
            int length = cargo.length();
        } catch (NullPointerException e) {
            System.err.println("Error: Cargo is not initialized. " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment process completed (Cleaning up resources).");
        }
    }
}
