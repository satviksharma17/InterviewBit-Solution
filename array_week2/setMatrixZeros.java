public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int col0=1,row=a.size(),col=a.get(0).size();
        for(int i=0;i<row;i++)
        {
            if(a.get(i).get(0)==0)
                col0=0;
            for(int j=1;j<col;j++)
            {
                if(a.get(i).get(j)==0){
                a.get(i).set(0,0);
                a.get(0).set(j,0);
                }

            }
        }
        for(int i=row-1;i>=0;i--)
        {
            for(int j=col-1;j>=1;j--)
            {
                if(a.get(0).get(j)==0 || a.get(i).get(0)==0)
                  a.get(i).set(j,0);
            }
                  if(col0==0)
                   a.get(i).set(0,0);
            
        }
	}
}
