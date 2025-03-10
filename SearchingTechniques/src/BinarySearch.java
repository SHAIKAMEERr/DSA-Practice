public class BinarySearch {
    public static int binarySearch(int[] arr, int targetElement){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == targetElement){
                return mid;
            }
            else if(arr[mid] >= targetElement){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
