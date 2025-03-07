public class SearchingIn2DArray
{
    public static int[] searchingIn2DArray(int[][] nums, int target)
    {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                if(nums[i][j] == target)
                {
                    return new int []{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
