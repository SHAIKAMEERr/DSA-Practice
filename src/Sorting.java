import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        System.out.println("Practicing Sorting Algorithms: ");

        //Bubble Sort
        int[] arr = {89, 28, 45, 12, 1, 60, 72, 77, 91, 6, 23};

        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        //Bubble Sorting for sorted array
        //In this program we learn how to stop comparing all the elements if they are sorted

        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80};

        BubbleSortForSortedArray.bubble(nums);
        System.out.println(Arrays.toString(nums));
    }
}