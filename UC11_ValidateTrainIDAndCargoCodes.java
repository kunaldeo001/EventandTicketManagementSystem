import java.util.regex.Pattern;

public class UC11_ValidateTrainIDAndCargoCodes {
    public static void main(String[] args) {
        String trainID = "TRN-2023";
        String validCargoCode = "CRG-A1";
        String invalidCargoCode = "CRG A1";
        
        Pattern trainIdPattern = Pattern.compile("^TRN-\\d{4}$");
        Pattern cargoCodePattern = Pattern.compile("^CRG-[A-Z0-9]+$");
        
        System.out.println("Validating Train ID '" + trainID + "': " + trainIdPattern.matcher(trainID).matches());
        System.out.println("Validating Cargo Code '" + validCargoCode + "': " + cargoCodePattern.matcher(validCargoCode).matches());
        System.out.println("Validating Cargo Code '" + invalidCargoCode + "': " + cargoCodePattern.matcher(invalidCargoCode).matches());
    }
}
