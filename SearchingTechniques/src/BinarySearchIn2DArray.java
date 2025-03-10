public class BinarySearchIn2DArray {
    public static int[] binarySearch2DArray(int[][] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start < arr.length && end >= 0){
            if(arr[start][end] == target){
                return new int[]{start, end};
            }
            else if(arr[start][end] < target){
                    start++;
            }else{
                end--;
            }
        }
        return new int[]{-1, -1};
    }
}
