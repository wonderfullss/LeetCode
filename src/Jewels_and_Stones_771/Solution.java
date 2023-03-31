package Jewels_and_Stones_771;

public class Solution {
   /* public int numJewelsInStones(String jewels, String stones) {
        String result = stones.replaceAll("[^" + jewels + "]", "");
        return result.length();
    }*/

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j))
                    count++;
            }
        }
        return count;
    }
}
