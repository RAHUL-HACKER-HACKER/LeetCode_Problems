class Solution {
    public int largestAltitude(int[] gain) {
        // declare prefix array of gains.lenght + 1
        int[] prefix = new int[gain.length + 1];
        // set first element as 0;
        prefix[0] = 0;
        // declare max variable and set it to 0 as min height
        int max = 0;
        // iterate over gain array
        for(int i = 0; i < gain.length; i++) {
            // calculate prefix sum on each iteration
            prefix[i + 1] = prefix[i] + gain[i];
            // check max on each iteration
            max = Math.max(prefix[i + 1], max);
        }
        // return max height
        return max;
    }
}