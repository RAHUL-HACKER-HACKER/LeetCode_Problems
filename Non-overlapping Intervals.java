class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a, b) -> a[1] - b[1]);//Sort the intervals in ascending order based on their end points
        int ans=0;
        int prev=intervals[0][1];
        for (int i = 1; i <intervals.length;i++) {
            if(prev>intervals[i][0]) {
                ans++;
            } else {
                prev=intervals[i][1];
            }
        }
        return ans;        
    }
}