package syx.the2022.the1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author syx
 * @className PeopleGroup
 * @description 1282.用户分组
 * @url https://leetcode-cn.com/problems/group-the-people-given-the-group-size-they-belong-to/
 * @tips 数组、哈希表
 * @date 2022/01/14 17:52
 */
public class PeopleGroup {

    public static void main(String[] args) {
        List<List<Integer>> lists = groupThePeople(new int[]{3, 3, 3, 3, 3, 1, 3});
        System.out.println(lists);
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>(16);

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int count = groupSizes[i];
            if (!map.containsKey(count)) {
                map.put(count, new ArrayList<>());
            }
            map.get(count).add(i);
            if (map.get(count).size() == count) {
                list.add(map.get(count));
                map.put(count, new ArrayList<>());
            }
        }
        return list;
    }

}
