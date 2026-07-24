import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<String> ls = new ArrayList<>(Arrays.asList(ransomNote.split("")));
        List<String> ls1 = new ArrayList<>(Arrays.asList(magazine.split("")));
        
        HashMap<String, Integer> mag = new HashMap<>();
        for(int i = 0; i < ls1.size(); i++) {
            mag.put(ls1.get(i), mag.getOrDefault(ls1.get(i), 0) + 1);
        }
        for(int j = 0; j < ls.size(); j++) {
            String currentChar = ls.get(j);
            int count = mag.getOrDefault(currentChar, 0);
            if (count <= 0) {
                return false;
            }
            mag.put(currentChar, count - 1);
        }
        return true;
    }
}