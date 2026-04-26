class Solution:
    def maxProfit(self, prices) -> int:
        buyPrice = prices[0]
        totalProfit = 0
        for i in range(0, len(prices)):
            if prices[i] < buyPrice:
                buyPrice = prices[i]
            profit = prices[i] - buyPrice
            totalProfit = max(totalProfit, profit)
        return totalProfit
