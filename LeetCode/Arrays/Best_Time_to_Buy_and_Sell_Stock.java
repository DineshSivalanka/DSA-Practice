/*

121. Best Time to Buy and Sell Stock

Problem Link:
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
*/


class Solution {
    public int maxProfit(int[] prices) {

        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        
        for(int price:prices) {
            if(price<minPrice) minPrice = price;
            int profit=price-minPrice;
            if(profit>maxProfit) maxProfit = profit;
        }

        return maxProfit;
    }
}