public class FindMinimunAndMaximum
{
    public static int findMinimum(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] <= min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaximum(int[] arr){
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
