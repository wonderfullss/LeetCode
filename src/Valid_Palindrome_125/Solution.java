package Valid_Palindrome_125;

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase().trim();
        if (s.length() == 0)
            return true;
        int i = 0;
        int j = s.length() - 1;
        while (j > i) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
