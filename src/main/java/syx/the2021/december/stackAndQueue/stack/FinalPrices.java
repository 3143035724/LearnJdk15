package syx.the2021.december.stackAndQueue.stack;

/**
 * @author syx
 * @className FinalPrices
 * @description 1475.商品折扣后的最终价格
 * @url https://leetcode-cn.com/problems/final-prices-with-a-special-discount-in-a-shop/
 * @tips 栈、数组、单调栈
 * @date 2021/12/28 17:50
 */
public class FinalPrices {

    public static void main(String[] args) {
        finalPrices(new int[]{8, 4, 6, 2, 3});
    }

    public static int[] finalPrices(int[] prices) {
        int length = prices.length;
        int[] discountAfterPrice = new int[length];
        for (int i = 0; i < length; i++) {
            int price = prices[i];
            discountAfterPrice[i] = price;
            for (int j = i; j < length; j++) {
                if (prices[j] <= prices[i] && j != i) {
                    discountAfterPrice[i] = price - prices[j];
                    j = length;
                }
            }
        }
        return discountAfterPrice;
    }

}
