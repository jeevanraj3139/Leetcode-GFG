class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> ls = new HashSet<>();
        for(int i = 0; i<sentence.length(); i++){
            ls.add(sentence.charAt(i));
        }
        if(ls.size() == 26){
            return true;
        }
        return false;
    }
}