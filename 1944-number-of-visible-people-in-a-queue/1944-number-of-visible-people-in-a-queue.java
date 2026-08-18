class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n  = heights.length;
        int arr[] = new int[n];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=n-1; i>=0; i--){
            int count =0;
            while(!dq.isEmpty() && heights[dq.peek()] < heights[i]){
                dq.poll();
                count++;
            }
            if(!dq.isEmpty()){
                count++;
            }
            arr[i] = count;
            dq.push(i);
        }
        return arr;
    }
}