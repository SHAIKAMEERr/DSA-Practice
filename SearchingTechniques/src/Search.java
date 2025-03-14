import java.util.Arrays;

public class Search
// Main Class to Run all the Searching Techniques
{
    public static void main(String[] args)
    {
        // Linear Search in an Array
        //Code related to Linear Search in an Array
        int[] arr = {12, 32,14, 61,79, 11, 91, 12, 37, 12};

        System.out.println("Find The First Index of a Target Element In An Array: "+LinearSearch
                .findFirstElement(arr, 12));
        System.out.println("Find The Last Index of a Target Element In An Array: "+LinearSearch
                .findLastElement(arr, 12));
        System.out.println("Find All the Indexes of the Target Element In An Array: "+Arrays
                .toString(LinearSearch.findAllElements(arr, 12)));

        System.out.println();

        //linear Search in a String
        //code related to Linear Search in a String
        String str = "PracticingJavaPrograms";

        System.out.println("Find The First Index of a Target Element In An String: "+LinearSearchInString
                .searchFirstIndexElement(str, 'P'));
        System.out.println("Find The Last Index of a Target Element In An String: "+LinearSearchInString
                .searchLastIndexElement(str, 'P'));
        System.out.println("Find All the Indexes of the Target Element In An String: "+Arrays
                .toString(LinearSearchInString.searchAllIndexes(str, 'P')));

        System.out.println();

        //Linear Search in a range
        //code related to Linear Search in a Range
        int[] array = {12, 34, 56, 67, 78, 98, 90, 13, 22};
        System.out.println("Searching element in a Range: "+SearchInTheRange
                .searchInARange(array, 1, 4, 56));

        System.out.println();

        //find Minimum and maximum in an array
        //code related to find Minimum and Maximum in an Array
        int[] minMax = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("Find Minimum element in an Array: "+ FindMinimunAndMaximum.findMinimum(minMax));
        System.out.println("Find Maximum element in an Array: "+ FindMinimunAndMaximum.findMaximum(minMax));

        System.out.println();

        //Linear search in a 2-D Array
        //code related to Linear Search in a 2-D Array
        int[][] nums =
                {{12, 13, 14},
                 {15, 16, 17},
                 {18, 19, 20}};
        System.out.println("Searching Element in 2 - D Array: "+Arrays.toString(SearchingIn2DArray
                .searchingIn2DArray(nums, 17)));

        System.out.println();
        //Binary Search in 2-D Array
        //Search element in 2-D sorted array
        int[][] srt = {
                {10, 20, 30, 40},
                {11, 22, 33, 44},
                {15, 25, 35, 45},
                {18, 28, 38, 48}
        };
        System.out.println("Binary Search in 2 - D Sorted Array: ");
        System.out.println(Arrays.toString(BinarySearchIn2DArray.binarySearch2DArray(srt, 39)));

        //binary Search in a Sorted Array

        int[] num = {10,20,30,40,50,60,70,80};
        System.out.println();;
        System.out.println("Binary Search in a sorted array: ");
        System.out.println(BinarySearch.binarySearch(num, 61));
    }
}