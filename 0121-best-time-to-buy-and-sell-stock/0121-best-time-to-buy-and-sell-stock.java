class Solution {
    public int maxProfit(int[] prices) {
        int byprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(byprice<prices[i]){ //profit
                int profit=prices[i]-byprice;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                byprice=prices[i];
            }
        }
        return maxprofit;
    }
}