public class WordSeq {

  public static void stringseq(int index , String str1 , String str2 ){
    
    if(index == str1.length()){

      System.out.print(str2 + "->");

      return;
      
    }

    stringseq(index + 1, str1, str2 + str1.charAt(index));

    stringseq(index + 1, str1, str2);

  }


  public static void main(String[] args) {
    
    String str1 = "ami";
    String str2 = "";

    stringseq(0 , str1 , str2);

  }


}
