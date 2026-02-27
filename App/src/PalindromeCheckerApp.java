import java.util.Scanner;
public class PalindromeCheckerApp {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Input text:");
      String str =input.nextLine();

      String rev="";
      for(int i=str.length()-1;i>=0;i--){

          rev += str.charAt(i);
      }

      boolean isPalindrome=str.equals(rev);

      if(isPalindrome){
          System.out.println("Entered String is a Palindrome");
      }else{
          System.out.println("Entered string is not a palindrome");
      }
      input.close();
    }

}
