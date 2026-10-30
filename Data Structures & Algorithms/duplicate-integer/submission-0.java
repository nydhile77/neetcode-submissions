
class Solution {
    public boolean hasDuplicate(int[] nums) {
       
    int n=nums.length;
    HashSet<Integer> check=new HashSet<>();
    for(int i=0;i<n;i++){
      if (check.contains(nums[i])){
        return true;}
     check.add(nums[i]);
    }
    return false;
}
}