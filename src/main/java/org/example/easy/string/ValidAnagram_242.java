package org.example.easy.string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_242 {
    // Given two strings s and t, return true if t is an anagram of s, and false
    // otherwise.
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) <= 0)
                return false;
            map.put(c, map.get(c) - 1);
        }
        return true;

    }
}
