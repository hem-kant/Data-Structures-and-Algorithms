public class StockInCooldown {

    static int maxProfit(int[] prices) {

        if(prices.length<=0)    return 0;


        int pre_Cooldown=0,curCooldown=0;
        int pre_buy = -prices[0],curBuy=0;
        int pre_sell = Integer.MIN_VALUE,curSell=0;
        for(int i=1;i<prices.length;i++){
            curCooldown = Math.max(pre_Cooldown,pre_sell);
            curBuy = Math.max(pre_buy,pre_Cooldown-prices[i]);
            curSell = pre_buy+prices[i];

            pre_Cooldown = curCooldown;
            pre_buy = curBuy;
            pre_sell = curSell;
        }
        return Math.max(curCooldown,curSell);
    }
    public static void main(String[] args) {
        int[]arr = { };

        System.out.println("With CoolDown max profit  " + maxProfit(arr));
    }
}