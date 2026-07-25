class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int [][] arr = new int[n][2];
        for(int i = 0; i<n; i++){
            arr[i][0] = difficulty[i];
            arr[i][1] = profit[i];
        }
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(worker);
        int total = 0;
        int pro = 0;
        int i = 0;
        for(int j:worker){
            while(i<n && arr[i][0] <= j){
                pro = Math.max(pro, arr[i][1]);
                i++;
            }
            total += pro;
        }
        return total;
    }
}