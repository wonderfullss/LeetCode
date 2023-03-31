package Removing_Stars_From_a_String_2390;

public class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*')
                str.append(s.charAt(i));
            else {
                str.deleteCharAt(str.length() - 1);
            }
        }
        return String.valueOf(str);
    }
}

