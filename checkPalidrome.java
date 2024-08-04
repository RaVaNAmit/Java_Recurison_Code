
public class checkPalidrome {
  

  public static boolean usingRecursion(String str1 , int start , int len){

    if(start == len / 2){

      return true;

    }

    if(str1.charAt(start) != str1.charAt(len - start - 1)){
      return false;
    }

    return usingRecursion(str1, start + 1, len);
  }
  public static void main(String[] args) {
    
    String str1 = "Level";
    
    str1 = str1.toLowerCase();

    Boolean result = usingRecursion(str1 , 0 , str1.length());

    System.out.println(" The Word is Palidrome :- " +result);
  }

}

