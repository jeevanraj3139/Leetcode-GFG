class Solution {
    public int countGroups(int[] position, int[] speed, int distance) {
        int n = position.length;

        if (n == 1) {
            return 1;
        }
        int[] groupSpeeds = new int[n];
        int groups = 0;

        int i = 0;
        while (i < n) {
            int right = i;

            while (right + 1 < n &&
                    (long) position[right + 1] - position[right] <= distance) {
                right++;
            }
            groupSpeeds[groups++] = speed[right];

            i = right + 1;
        }
        int answer = 1;
        int minimumSpeed = groupSpeeds[groups - 1];
        for (int j = groups - 2; j >= 0; j--) {
            if (groupSpeeds[j] <= minimumSpeed) {
                answer++;
                minimumSpeed = groupSpeeds[j];
            }
        }

        return answer;
    }
}