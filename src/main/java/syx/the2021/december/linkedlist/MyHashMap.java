package syx.the2021.december.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className MyHashMap
 * @description 706.设计哈希映射
 * @url https://leetcode-cn.com/problems/design-hashmap/
 * @tips 设计、数组、哈希表、链表、哈希函数
 * @date 2021/12/27 15:33
 */
public class MyHashMap {

    private List<Node> list;

    public MyHashMap() {
        list = new ArrayList<>();
    }

    public void put(int key, int value) {
        Node info = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).key == key) {
                info = new Node(key, value);
                list.set(i, info);
                break;
            }
        }
        if (info == null) {
            list.add(new Node(key, value));
        }

    }

    public int get(int key) {
        for (Node node : list) {
            if (node.key == key) {
                return node.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).key == key) {
                list.remove(i);
                return;
            }
        }
    }

    static class Node {
        private int key;
        private int value;


        public Node() {
        }

        public Node(int key) {
            this.key = key;
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }


    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        // ["MyHashMap","put","put","get","get","put","get","remove","get"]
        //[[],[1,1],[2,2],[1],[3],[2,1],[2],[2],[2]]
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        myHashMap.get(1);
        myHashMap.get(3);
        myHashMap.put(2, 1);
        myHashMap.get(2);
        myHashMap.remove(2);
        myHashMap.get(2);
    }
}
