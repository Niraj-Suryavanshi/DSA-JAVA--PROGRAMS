
public class BuySellStocks {

    public static int buyAndsellStocks(int prices[])
    {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice<prices[i])
            {
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else
            {
                buyPrice=prices[i];
            }
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int maxProfit=buyAndsellStocks(prices);
        System.out.println("Maximum profit in stock is: "+maxProfit);

    }
}
