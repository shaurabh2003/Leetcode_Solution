class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
         List<Integer> hab = new ArrayList();
            Arrays.sort(nums);
            for(int i = 0; i<nums.length; i++){
                if(target == nums[i]){
                    hab.add(i);
                }
            }
            return hab;
    }
}