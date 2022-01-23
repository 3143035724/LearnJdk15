package syx.the2022.the1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author syx
 * @className EncodeDecodeTinyURL
 * @description 535.TinyURL的加密和解密
 * @url https://leetcode-cn.com/problems/encode-and-decode-tinyurl/
 * @tips 设计、哈希表、字符串、哈希函数
 * @date 2022/01/22 18:28
 */
public class EncodeDecodeTinyURL {
}


class Codec {

    private static Map<String, String> map = new HashMap<>();
    private final String KEY = "qwert159yui748opas263dfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    private final String URL = "http://tinyurl.com/";

    public String encode(String longUrl) {

        char[] chars = new char[6];
        for (int i = 0; i < 6; i++) {
            chars[i] = KEY.charAt((int) (Math.random() * 15));
        }
        String shortUrl = KEY + new String(chars);
        if (!map.containsKey(shortUrl)) {
            map.put(shortUrl, longUrl);
        }

        return shortUrl;
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
