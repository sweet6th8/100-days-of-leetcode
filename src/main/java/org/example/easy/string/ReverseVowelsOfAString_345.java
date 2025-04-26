package org.example.easy.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowelsOfAString_345 {
    // Given a string s, reverse only all the vowels in the string and return it.
    // The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower
    // and upper cases, more than once.
    public String reverseVowels(String s) {
        StringBuilder sb1 = new StringBuilder();
        List<Integer> indexs = new ArrayList<>();
        int n = s.length();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        // Find index of vowels
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (vowels.contains(c)) {
                indexs.add(i);
            }
        }
        int j = indexs.size() - 1;
        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            if (vowels.contains(c1)) {
                sb1.append(s.charAt(indexs.get(j)));
                j--;
            } else {
                sb1.append(c1);
            }
        }
        return sb1.toString();
    }
}
