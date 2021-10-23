public class Solution {
    public int perfectPeak(ArrayList<Integer> A) {
        int n=A.size();
        int[] mx=new int[n];
        int[] mn=new int[n];
        mx[0]=A.get(0);
        mn[n-1]=A.get(n-1);
        int mxx=mx[0];
        int mnn=mn[n-1];
        for(int i=1;i<n;i++)
        {
            mxx=Math.max(mxx,A.get(i));
            mx[i]=mxx;
        }
         for(int i=n-2;i>=0;i--)
        {
            mnn=Math.min(mnn,A.get(i));
            mn[i]=mnn;
        }
        for(int i=1;i<n-1;i++)
        {
            if(mn[i]==A.get(i) && mx[i]==A.get(i))
            {
                if(A.get(i)>mx[i-1] && A.get(i)<mn[i+1])
                return 1;
            }
        }
        return 0;
    }
}
