
import java.util.Scanner;

public class PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base condition: if start crosses end, it's a palindrome
        if (start >= end) {
            return true;
        }

        // Check characters at start and end
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call moving towards the center
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Recursive Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for uniform checking
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Call recursive method
        boolean result = isPalindrome(cleanedInput, 0, cleanedInput.length() - 1);

        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
