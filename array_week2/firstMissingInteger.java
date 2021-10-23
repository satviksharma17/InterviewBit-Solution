public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        Collections.sort(A);
int curr = 1;
for(int i =0;i<A.size();i++){
if(A.get(i) <=0) continue;
if(curr == A.get(i)){
curr++;
continue;
}
if(curr < A.get(i)){
break;
}
}
return curr;
    }
}
