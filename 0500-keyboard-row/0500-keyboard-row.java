class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        for(String s : words){
            String k = s.toLowerCase();
            if(k.matches("^[qwertyuiop]*$")||k.matches("^[asdfghjkl]*$")||k.matches("^[zxcvbnm]*$")){
                res.add(s);
            }
        }
        String arr[] = new String[res.size()];
        return res.toArray(arr);
    }
}