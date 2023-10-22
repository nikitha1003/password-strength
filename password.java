package java_internship;
import java.util.Scanner;

public class Passwordstrength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Create a password for your account");
	        System.out.println("Enter your password: ");
	        String password = scanner.nextLine();

	        String strength = checkPasswordStrength(password);

	        System.out.println("Password Strength: " + strength);

	        scanner.close();
	}
	private static String checkPasswordStrength(String password) {
        // Check length
        if (password.length() >= 8) {
          
            if (containsUppercase(password) && containsLowercase(password) && 
            		containsDigit(password)&& containsSpecialCharacter(password)) {
                return "Strong";
            }} else if(password.length()>=6 && containsUppercase(password) && containsLowercase(password)&& containsDigit(password)){
                return "Medium,add special characters and digits to make it stronger";
            }
            else {
                return "Weak, your password must contain at least 8 characters and include a mix of uppercase, lowercase, digits, and special characters";
            }
		return password;
        
		
    }

    private static boolean containsUppercase(String password) {
        return !password.equals(password.toLowerCase());
    }

    private static boolean containsLowercase(String password) {
        return !password.equals(password.toUpperCase());
    }

    private static boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
} 
    return false;}
    private static boolean containsSpecialCharacter(String password) {
        return !password.matches("[A-Za-z0-9]*");
    }

}
