class Solution {

    public boolean allZero(int[] counter) {
        for (int x : counter) {
            if (x != 0) return false;
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {

        int[] counter = new int[26];

        for (char ch : p.toCharArray()) {
            counter[ch - 'a']++;
        }

        int left = 0, right = 0;

        List<Integer> ans = new ArrayList<>();

        while (right < s.length()) {

            counter[s.charAt(right) - 'a']--;

            if (right - left + 1 == p.length()) {

                if (allZero(counter)) {
                    ans.add(left);
                }

                counter[s.charAt(left) - 'a']++;
                left++;
            }

            right++;
        }

        return ans;
    }
}