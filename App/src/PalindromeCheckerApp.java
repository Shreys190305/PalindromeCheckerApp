import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        boolean palindrome = true;
        while (start < end) {
            if (arr[start] != arr[end]) {
                palindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Is Palindrome? " + palindrome);
    }
}