package Truncate_Sentence_1816;

public class Solution {
    public String truncateSentence(String s, int k) {
        String[] arraySentence = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++){
            result.append(arraySentence[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }
}