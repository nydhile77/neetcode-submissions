class Solution {
    public int majorityElement(int[] nums) {
     int frequency=nums.length/2;
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        int val=nums[i];
        if(map.containsKey(val)){
            map.put(val,map.get(val)+1); }
        else{
           map.put(val,1);}
     }
     for(int key: map.keySet()){
        if(map.get(key)>frequency){
            return key;
        }
     }
     return -1;
    }
}