class Solution {
    public int removeDuplicates(int[] nums) {
        int officer=0;
        int rest=1;
        int cm=1;
        while(cm<nums.length){
            if(nums[cm]==nums[cm-1]){
                cm++;
                continue;
            }
            //unique value find :
            nums[officer+1]=nums[cm];
            rest++;
            officer++;
            cm++;
        }
        return rest;
    }
}