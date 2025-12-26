// Last updated: 26/12/2025, 16:01:53
/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    var profit = 0;

    for(var fast=0; fast<=prices.length;fast++){
        if(prices[fast] < prices[fast+1]){
            profit += prices[fast+1]-prices[fast]

        }
    }
    return profit;
};