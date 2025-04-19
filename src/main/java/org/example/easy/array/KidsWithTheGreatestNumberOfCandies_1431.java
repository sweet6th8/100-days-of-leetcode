package org.example.easy.array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        // Find the maximum number
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = candies[i] > max ? candies[i] : max;
        }
        // Handle
        int temp = max - extraCandies;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= temp) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }

}
