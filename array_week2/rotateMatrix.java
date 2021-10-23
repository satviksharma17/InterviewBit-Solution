public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
       int n = a.size();
Collections.reverse(a);
for(int i = 1;i<n;i++){
for(int j = 0;j<i;j++){
int temp = a.get(i).get(j);
a.get(i).set(j,a.get(j).get(i)) ;
a.get(j).set(i,temp);
}
}
	}
}
