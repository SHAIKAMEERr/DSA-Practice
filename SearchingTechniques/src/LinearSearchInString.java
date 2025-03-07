import java.util.ArrayList;
import java.util.List;
public class LinearSearchInString {

    public static int searchFirstIndexElement(String str, char searchElement)
    {
        for(int index = str.length() - 1; index >= 0 ;index--)
        {
            if(str.charAt(index) == searchElement)
            {
                return index;
            }
        }
        return -1;
    }
    public static int searchLastIndexElement(String str, char searchElement){

        for(int index = 0; index < str.length() - 1; index++)
        {
            if(str.charAt(index) == searchElement)
            {
                return index;
            }
        }
        return -1;
    }
    public static int[] searchAllIndexes(String str, char searchElement){

        //int[] result = new int[str.length()/2];
        List<Integer> result = new ArrayList<>();
        int count = 0;

        for(int index = 0; index <= str.length() - 1; index++)
        {
            if(searchElement == str.charAt(index))
            {
                result.add(count, index);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
