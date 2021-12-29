package syx.the2021.december.stackAndQueue.stack;

/**
 * @author syx
 * @className CrawlerLogFolder
 * @description 1598.文件夹操作日志搜集器
 * @url https://leetcode-cn.com/problems/crawler-log-folder/
 * @tips 栈、数组、字符串
 * @date 2021/12/29 14:04
 */
public class CrawlerLogFolder {

    public int minOperations(String[] logs) {
        // 返回主文件夹的层数
        int ans = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                ans = Math.max(0, ans - 1);
            } else if (!logs[i].equals("./")) {
                ans++;
            }
        }
        return ans;
    }

}
