class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
         int value=prices[i];
         if(value<min){
            min=value;}
        else{
            int currentprofit=value-min;
            if(currentprofit>max_profit){
              max_profit=currentprofit;}
        }}
 return max_profit;


    }
}
