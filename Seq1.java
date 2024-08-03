import java.util.ArrayList;

public class Seq1 {

  public static void seq(int index , int arr[] , ArrayList<Integer> store){

    if(index == arr.length){

      for(int i = 0; i < store.size(); i++){

        System.out.print(store.get(i));

      }
      System.out.print("->");
      return;

    }

    store.add(arr[index]);
    seq( index + 1, arr, store);
    store.remove(store.size() - 1);
    seq(index + 1, arr, store);

  }

  public static void main(String[] args) {
    

    int arr[] = {3 , 1 , 2};


    System.out.println(" Sequence in Normal Pattern ");

    seq(0 , arr , new ArrayList<>());



  }
  
}
