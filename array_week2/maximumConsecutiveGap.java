public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        int[] a=new int[A.length];
        for(int i=0;i<a.length;i++)
        {
            a[i]=A[i];
        }
       Arrays.sort(a);
       int max=0;
       for(int i=0;i<a.length-1;i++)
       {
           if(a[i+1]-a[i]>max)
           max=a[i+1]-a[i];
       }
       return max;
    }
}