class Solution {
    public String removeStars(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int i = -1;
        for (char c : s.toCharArray()) {
            if (c == '*')
                sb.deleteCharAt(i--);
            else {
                sb.append(c);
                i++;
            }
        }
        return sb.toString();
    }
}