import java.util.ArrayList;
import java.util.List;

public class LinearSearch
{
    public static int findFirstElement(int[] arr, int targetElement)
    {
        for(int index = 0; index < arr.length; index++)
        {
            if(arr[index] == targetElement)
            {
                return index;
            }
        }
        return -1;
    }

    public static int findLastElement(int[] arr, int targetElement)
    {
        for(int index = arr.length -1; index <= 0 ;index++)
        {
            if(arr[index] == targetElement)
            {
                return index;
            }
        }
        return -1;
    }

    public static int[] findAllElements(int[] arr, int targetElement)
    {
        List<Integer> res = new ArrayList<>();
        for(int index = 0; index <= arr.length - 1; index++)
        {
            if(targetElement == arr[index])
            {
                res.add(index);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
