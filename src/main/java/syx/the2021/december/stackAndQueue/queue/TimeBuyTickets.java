package syx.the2021.december.stackAndQueue.queue;

/**
 * @author syx
 * @className TimeBuyTickets
 * @description 2073.买票需要的时间
 * @url https://leetcode-cn.com/problems/time-needed-to-buy-tickets/
 * @tips 队列、数组、模拟
 * @date 2021/12/29 14:17
 */
public class TimeBuyTickets {

    public static void main(String[] args) {
        timeRequiredToBuy(new int[]{2, 3, 2}, 2);
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {

        int count = 0;
        for (int ticket : tickets) {
            count = Math.max(count, ticket);
        }
        int time = 0;
        for (int j = 0; j < count; j++) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[k] == 0) {
                    return time;
                }
                if (tickets[i] == 0) {
                    continue;
                }
                tickets[i]--;
                time += 1;
            }
        }
        return time;
    }

}
