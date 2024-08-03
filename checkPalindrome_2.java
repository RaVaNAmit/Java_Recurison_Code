public class checkPalindrome_2 {


  public static boolean checkpalindrome(String str , int start , int end){

    if(start == str.length() / 2){
      return true;
    }

    if(str.charAt(start) == str.charAt(end)){
      start++;
      end--;
    }

    else{
      return false;
    }

    return checkpalindrome(str, start, end);

  }

  public static void main(String[] args) {
    

    // Using Two pointer

    String str = "Level";

    str = str.toLowerCase();

    boolean Restore = checkpalindrome(str , 0  , str.length() - 1);

    System.out.println("The word is Palindrome " +Restore);

  }
  
}
