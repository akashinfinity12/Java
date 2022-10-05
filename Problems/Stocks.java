// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

public class Stocks {
    public static void main(String[] args) {
        int[] stocks = { 7, 1, 5, 3, 6, 4 };
        int left = 0, right = 1, maxProfit = 0, buy = 0, sell = 1;

        while (right < stocks.length) {
            if (stocks[left] > stocks[right])
                left = right;
            else {
                int newProfit = stocks[right] - stocks[left];
                if (maxProfit < newProfit) {
                    maxProfit = newProfit;
                    buy = left;
                    sell = right;
                }
            }
            right++;
        }
        // normal people will look at the array from day 1 not day 0
        buy++;
        sell++;
        System.out.println("Buy on day: " + buy + "\nSell on day: " + sell);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}