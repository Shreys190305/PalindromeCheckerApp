import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Input: ");
            String input = sc.nextLine();

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }

            boolean palindrome = true;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != stack.pop()) {
                    palindrome = false;
                    break;
                }
            }

            System.out.println(" Is Palindrome? " + palindrome);
        }
    }

