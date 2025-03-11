public class BubbleSortForSortedArray {

    public static void bubble(int[] arr){
        boolean bool = false;
        for(int i = 0; i < arr.length ; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    bool = true;
                }
            }
            if(!bool){
                break;
            }
        }
    }
}
