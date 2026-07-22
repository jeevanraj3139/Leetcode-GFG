class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int count = 0;
        Arrays.sort(people);
        int low = 0;
        int high = n-1;
        while(low<=high){
            if(people[low] + people[high]<= limit){
                count += 1;
                low++;
                high--;
            }
            else{
                high--;
                count++;
            }
        }
        return count;
    }
}