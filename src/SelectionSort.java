public class SelectionSort {

    public static void selectionSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            arr[i] = toFindMax(arr);
            
        }
    }
    public static int toFindMax(int[] arr){

        int count = 0;
        int max = arr[0];

        for(int i = 0; i < arr.length - count; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
