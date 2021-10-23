public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] arr) {
        int n=arr.length;
         if (n <= 1)
            return -1;
      
        int slow = arr[0];
        int fast = arr[arr[0]];
          while (fast != slow)
        {
      
            // move one step for slow
            slow = arr[slow];
      
            // move two step for fast
            fast = arr[arr[fast]];
        }
         fast = 0;
        while (slow != fast)
        {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
