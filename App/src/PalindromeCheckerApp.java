
import java.util.Scanner;

class PalindromeChecker {
    private String input;

    public PalindromeChecker(String input) {
        this.input = input;
    }

    public boolean checkPalindrome() {
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        return isPalindrome(cleanedInput, 0, cleanedInput.length() - 1);
    }

    private boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Object-Oriented Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);
        boolean result = checker.checkPalindrome();

        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}