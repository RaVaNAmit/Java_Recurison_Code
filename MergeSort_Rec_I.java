
public class MergeSort_Rec_I {


  public static void merge(int arr[] , int low , int high , int mid , int total){
 
      int left = low;
      int right = mid + 1;

      int k = 0;

      int arr1[] = new int[total];

      while(left <= mid &&  right <= high){

        if(arr[left] <= arr[right]){
          arr1[k] = arr[left];
          left++;
        }
        else{
          arr1[k] = arr[right];
          right++;
        }

        k++;

      }

    while(left <= mid){
      arr1[k] = arr[left];
      left++;
      k++;
    }

    while (right <= high) {
      arr1[k] = arr[right];
      right++;
      k++;
    }


    for(int i = low; i <= high; i++){
      arr[i] = arr1[i - low];
    } 



  } 


  public static void divide(int arr[] , int low , int high , int total){

    if(low >= high){
      return;
    }

    int mid = (low + high) / 2;
    divide(arr, low, mid, total);
    divide(arr, mid + 1, high, total);
    merge(arr , low , high , mid , total);
  }


  public static void main(String[] args) {
    
    int arr[] = {3, 1, 2, 4, 1, 5, 2, 6, 4};

    divide(arr , 0 , arr.length - 1 , arr.length);


    for(int i = 0; i < arr.length ; i++){

      System.out.print(arr[i] + " -> ");
    }

  }

  
}