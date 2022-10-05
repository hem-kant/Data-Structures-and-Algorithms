package com.hemkant.DSA;

public class CoinChangeTwo {

    static long getNumberOfWays(int amount, int[] coins)
    {
        int[] numberOfWays = new int [amount + 1];
        numberOfWays[0] = 1;
        for (int i = 0; i < coins.length; i++) {

            for (int j = 0; j < numberOfWays.length; j++) {
                if (coins[i] <= j) {
                    numberOfWays[j] += numberOfWays[j - coins[i]];
                }
            }
        }
        return numberOfWays[amount];
    }
    public static void main(String[] args)
    {
        int coins[] = { 1, 5, 10 };
        System.out.println(getNumberOfWays(8, coins));
    }
}
