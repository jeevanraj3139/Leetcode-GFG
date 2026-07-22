class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(deck);
        for(int i = 0; i<deck.length; i++){
            q.add(i);
        }
        int res[] = new int [deck.length];
        for(int k : deck){
            res[q.poll()] = k;
            if(!q.isEmpty()){
                q.add(q.poll());
            }
        }
        return res;
    }
}