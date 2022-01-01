package syx.the2021.december.stackAndQueue.stack;

/**
 * @author syx
 * @className EatLunch
 * @description 1700.无法吃午餐的学生数量
 * @url https://leetcode-cn.com/problems/number-of-students-unable-to-eat-lunch/
 * @tips 栈、队列、数组、模拟
 * @date 2021/12/29 9:30
 */
public class EatLunch {

    public int countStudents(int[] students, int[] sandwiches) {

        int[] like = new int[2];
        for (int student : students) {
            like[student]++;
        }
        for (int sandwich : sandwiches) {
            if (like[sandwich] == 0) {
                // 证明三明治已经取完了
                break;
            }
            like[sandwich]--;
        }
        return like[0] + like[1];
    }

}
