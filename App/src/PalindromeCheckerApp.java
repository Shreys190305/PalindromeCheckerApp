import java.util.Scanner;
public class PalindromeCheckerApp {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Input text:");
      String str =input.nextLine();

      boolean isPalindrome=false;
      for(int i=0;i<str.length()/2;i++){
          for(int j=str.length()-1;j>=0;j--){
              if(str.charAt(i)==str.charAt(j)){

                  isPalindrome=true;
              }
          }
      }
      if(isPalindrome){
          System.out.println("Entered String is a Palindrome");
      }
      input.close();
    }

}
