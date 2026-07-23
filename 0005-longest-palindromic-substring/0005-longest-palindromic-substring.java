class Solution {
    public String longestPalindrome(String s) {
        int maxlen = 1;
        String sub = s.substring(0,1);

        for(int i =0; i<s.length(); i++){
            for(int j=i+maxlen; j<= s.length();j++){
                if(j-i > maxlen && pal(s.substring(i,j))){
                    maxlen = j-i;
                    sub = s.substring(i, j);
                }
            }
        }
        return sub;
        }
        public static boolean pal(String k){
            int left = 0;
            int right = k.length()-1;

            while(left<right){
                if(k.charAt(left) != k.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
