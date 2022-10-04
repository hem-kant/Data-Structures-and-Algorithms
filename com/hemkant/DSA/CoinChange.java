package com.hemkant.DSA;

public class CoinChange {

    static int coinChange(int coins[], int amount)
    {
        if (amount ==0) return 0;
        int result = Integer.MAX_VALUE;

        if(coins.length>0) {
            for (int i = 0; i < coins.length; i++) {
                if (coins[i] <= amount) {
                    int subResult = coinChange(coins, amount - coins[i]);

                    if (subResult != Integer.MAX_VALUE && subResult + 1 < result) {
                        result = subResult + 1;
                    }

                }

            }
        }
        return result ==Integer.MAX_VALUE ?-1:result==0?-1:result ;
    }

    public static void main(String[] args)
    {
        int coins[]= {1,2,3};
        int coinsLength = coins.length;
        int totalAmount= 7;
        System.out.println("Minimum number of coins required for "
                + "totalAmount " + totalAmount + " is "+ coinChange(coins, totalAmount) );


    }


}
