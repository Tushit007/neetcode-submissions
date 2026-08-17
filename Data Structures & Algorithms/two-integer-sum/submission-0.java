class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> res= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            res.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int d=target-nums[i];
            if(res.containsKey(d)&&res.get(d)!=i){
            return new int[] {i,res.get(d)};
        }
        }
return new int[]{};

        
        
        }
}
