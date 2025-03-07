public class SearchInTheRange
{
    public static int searchInARange(int[] arr, int startingIndex, int endingIndex, int targetElement)
    {
        for(int i = startingIndex; i <= endingIndex; i++){
            if(arr[i] == targetElement){
                return i;
            }
        }
        return -1;
    }
}
