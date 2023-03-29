package Maximum_Number_of_Words_Found_in_Sentences_2114;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int mostWordsFound(String[] sentences) {
        List<Integer> list = new ArrayList<>();
        for (String sentence : sentences) {
            list.add(sentence.split(" ").length);
        }
        return Collections.max(list);
    }
}
