class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n*n;
        
        // Step 1: Create frequency tracker
        int[] freq = new int[size+1];
        
        // Step 2: Count occurrences by iterating through grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Your code here - mark frequency
                freq[grid[i][j]]++;
            }
        }
        
        // Step 3: Find repeated (count=2) and missing (count=0)
        int[] result = new int[2];
        for (int num = 1; num <= size; num++) {
            if (freq[num] == 2) {
                // Store repeated value
                result[0] = num;
            } else if (freq[num] == 0) {
                // Store missing value
                result[1] = num;
            }
        }
        
        return result;
    }
}