import java.util.*;

// Interface for Strategy Pattern
interface PalindromeStrategy {
    boolean isPalindrome(String text);
    String getName(); // for display purposes
}

// Stack-based Strategy
class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) stack.push(c);
        for (char c : text.toCharArray())
            if (stack.pop() != c) return false;
        return true;
    }

    public String getName() {
        return "Stack Strategy";
    }
}

// Deque-based Strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : text.toCharArray()) deque.addLast(c);
        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast()) return false;
        return true;
    }

    public String getName() {
        return "Deque Strategy";
    }
}

// Simple iterative approach
class IterativeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = text.length() - 1;
        while (left < right)
            if (text.charAt(left++) != text.charAt(right--)) return false;
        return true;
    }

    public String getName() {
        return "Iterative Strategy";
    }
}

// Main App
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        // List of strategies to compare
        List<PalindromeStrategy> strategies = Arrays.asList(
                new StackStrategy(),
                new DequeStrategy(),
                new IterativeStrategy()
        );

        System.out.println("\nPerformance Comparison:");
        for (PalindromeStrategy strategy : strategies) {
            long start = System.nanoTime();
            boolean result = strategy.isPalindrome(input);
            long end = System.nanoTime();
            long duration = end - start;

            System.out.printf("%-20s | Result: %-5s | Time: %d ns%n",
                    strategy.getName(), result, duration);
        }

        scanner.close();
    }
}