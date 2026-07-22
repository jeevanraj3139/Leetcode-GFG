class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List <String>> m = new HashMap<>();
        for (String c : strs){
            char ch[] = c.toCharArray();
            Arrays.sort(ch);
            String new1 = new String(ch);
            if(!m.containsKey(new1)){
                m.put(new1, new ArrayList<>());
            }
            m.get(new1).add(c);
        }
        return new ArrayList<>(m.values());
    }
}